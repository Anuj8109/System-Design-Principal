package SystemDesign.Prototype.Shapes;

public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape(){

    }

    public Shape(Shape target){
        if(target != null){
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object object2){
        if(!(object2 instanceof Shape)) return false;
        Shape shape = (Shape) object2;
        return shape.x == this.x && shape.y == this.y && shape.color == this.color;
    }
}
