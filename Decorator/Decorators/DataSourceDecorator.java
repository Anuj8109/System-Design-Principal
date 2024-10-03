package SystemDesign.Decorator.Decorators;

public abstract class DataSourceDecorator implements DataSource{
    public DataSource wrappee;

    public DataSourceDecorator(DataSource source){
        this.wrappee = source;
    }
    
    @Override
    public String readData() {
        return wrappee.readData();
        // TODO Auto-generated method stub
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
        // TODO Auto-generated method stub
    }
    
}
