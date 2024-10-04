package Prototype;

import java.util.ArrayList;
import java.util.List;

import Prototype.Shapes.Circle;
import Prototype.Shapes.Rectangle;
import Prototype.Shapes.Shape;

public class Demo {
    public static void main(String[] args){
        List<Shape> shapes = new ArrayList<>();

        Circle circle = new Circle();
        circle.radius = 5;
        circle.x = 10;
        circle.y = 20;
        circle.color = "Blue";
        shapes.add(circle);

        Circle anotherCircle = (Circle)circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.color = "Red";
        rectangle.length = 2;
        rectangle.width = 3;
        shapes.add(rectangle);
        compareShapes(shapes);
    }

    private static void compareShapes(List<Shape> shapes){
        List<Shape> shapeCopy = new ArrayList<>();
        for(Shape shape : shapes){
            shapeCopy.add(shape.clone());
        }

        for(int i = 0; i < shapes.size(); i++){
            if(shapes.get(i) != shapeCopy.get(i)){
                System.out.println(i + ": Shapes are different objects (yay!)");
                if(shapes.get(i).equals(shapeCopy.get(i))){
                    System.out.println(i + ": And they are identical (yay!)");
                }else{
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            }else{
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}
