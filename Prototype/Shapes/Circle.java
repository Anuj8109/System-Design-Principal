package Prototype.Shapes;

public class Circle extends Shape{

    public int radius;

    public Circle(){
    }

    public Circle(Circle target){
        super(target);
        if(target != null){
            this.radius = target.radius;
        }
    }


    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object input){
        if(!(input instanceof Circle) || !super.equals(input)) return false;
        Circle circle = (Circle) input;
        return radius == circle.radius;
    }
    
}
