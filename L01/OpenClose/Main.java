import java.awt.Point;

public class Main {
	public static void main(String[] args) {
        Shape shapes[] = new Shape[6];
        shapes[0] = new Square(10, new Point(3,7));
        shapes[1] = new Circle(10, new Point(8,2));
        shapes[2] = new Square(8, new Point(5,9));
        shapes[3] = new Circle(7, new Point(4,5));
        shapes[4] = new Circle(5, new Point(2,3));
        shapes[5] = new Rectangle(6, 4, new Point(8,9));
        
        Client.drawAllShape(shapes);
    }
}