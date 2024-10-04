package Decorator.Decorators;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

//Base Decorator
public class FileDataSource implements DataSource {
    private String name;

    public FileDataSource(String filname){
        this.name = filname;
    }
    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);
        try (FileReader reader = new FileReader(file)){
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return new String(buffer);
    }

    @Override
    public void writeData(String data) {
        File file = new File(name);
        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
