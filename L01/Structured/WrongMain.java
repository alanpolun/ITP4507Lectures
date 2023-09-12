import java.awt.Point;

public class WrongMain {
    public static void main(String[] args) {
        WrongShape shapes[] = new WrongShape[5];
        shapes[0] = new WrongSquare(WrongShape.SQUARE, 10, new Point(3,7));
        shapes[1] = new WrongCircle(WrongShape.CIRCLE, 10, new Point(8,2));
        shapes[2] = new WrongSquare(WrongShape.SQUARE, 8, new Point(5,9));
        shapes[3] = new WrongCircle(WrongShape.CIRCLE, 7, new Point(4,5));
        shapes[4] = new WrongCircle(WrongShape.CIRCLE, 5, new Point(2,3));
        
        WrongClient.drawAllShape(shapes);
    }

}
