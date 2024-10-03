package SystemDesign.Decorator.Decorators;

public interface DataSource {
    
    public String readData();
    public void writeData(String data);
}
