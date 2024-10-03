package SystemDesign.Observer;

import SystemDesign.Observer.edition.Editior;
import SystemDesign.Observer.listeners.EmailNotificationListener;
import SystemDesign.Observer.listeners.LogOpenListener;

public class Demo {
    public static void main(String[] args){
        Editior editor = new Editior();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));
        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
