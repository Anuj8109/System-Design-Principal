package SystemDesign.Prototype.Shapes;

public class Rectangle extends Shape{

    public int length;
    public int width;

    public Rectangle(){
    }

    public Rectangle(Rectangle rectangle){
        super(rectangle);
        //Rectangle rectangle = (Rectangle) shape;
        if(rectangle != null){
            length = rectangle.length;
            width = rectangle.width;
        }
        
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object input){
        if(!(input instanceof Rectangle) || !super.equals(input)) return false;
        Rectangle rectangle = (Rectangle) input;
        return rectangle.length == length && rectangle.width == width;
    }
    
}
