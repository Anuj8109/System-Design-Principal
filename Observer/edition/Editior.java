package SystemDesign.Observer.edition;

import java.io.File;

import SystemDesign.Observer.publisher.*;

public class Editior {
    public EventManager events;
    private File file;

    public Editior(){
        this.events = new EventManager("open","save","close");
    }

    public void openFile(String filePath){
        this.file = new File(filePath);
        events.notify("open",this.file);
    }
    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("save", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }
}
