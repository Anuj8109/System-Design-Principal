package SystemDesign.Facade;

import java.io.File;

public class Demo {
    public static void main(String[] args){
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = (File)converter.convertVideo("test", "mp4");
    }
}
