package SystemDesign.Observer.publisher;

import java.util.List;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import SystemDesign.Observer.listeners.EventListener;

public class EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String...operations){
        for(String operation:operations){
            listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener){
        if(!this.listeners.containsKey(eventType)) System.out.println("Event not found");
        this.listeners.get(eventType).add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener){
        this.listeners.get(eventType).remove(listener);
    }

    public void notify(String eventType, File file){
        List<EventListener> users = this.listeners.get(eventType);
        for(EventListener user:users){
            user.update(eventType, file);
        }
    }
}
