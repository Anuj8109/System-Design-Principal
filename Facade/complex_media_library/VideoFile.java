package SystemDesign.Facade.complex_media_library;

public class VideoFile {
    private String name;
    private String codecType;

    public VideoFile(String name){
        this.name = name;
        this.codecType = name.substring(name.indexOf(".") + 1);
    }

    public String getName(){
        return this.name;
    }

    public String getCodecType(){
        return this.codecType;
    }

}
