package shapes.colorable;

import shapes.shape.Circle;
import shapes.shape.Rectangle;
import shapes.shape.Shape;
import shapes.shape.Square;

public class colorableSquareTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Rectangle();
        for (Shape shape : shapes) {
            if (shape instanceof Square)
                System.out.println(((Square) shape).howToColor());
        }
    }
}
