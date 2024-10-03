package SystemDesign.Composite.Shapes;
import java.awt.*;

public interface Shape {
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void move(int x,int y);
    boolean isInsideBounds(int x,int y);
    void select();
    void unselect();
    boolean isSelected();
    void paint(Graphics graphics);
}
