import java.awt.*;

public class WRectangle extends WrongShape {
    private double width;
    private double height;
    private Point topLeft;

    public WRectangle(int type, double width, double height, Point topLeft) {
        super(type);
        this.width = width;
        this.height = height;
        this.topLeft = topLeft;
    }

    public double getWidth() { return this.width; }
    public double getHeight() { return this.height; }
    public Point getTopLeft() { return this.topLeft; }
}
