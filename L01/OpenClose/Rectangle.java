import java.awt.Point;

public class Rectangle extends Shape {
    private double width;
    private double height;

	public Rectangle(double width, double height, Point topLeft) {
		super(topLeft);
        this.width = width;
        this.height = height;
	}
	
	public double getHeight() { return this.height; }
	
	public double getWidth() { return this.width; }
	
	public void draw(){
		System.out.println("Rectangle Detail:");
		System.out.println("Height:" + getHeight());
		System.out.println("Width:" + getWidth());
		System.out.println("Top Left:" + super.getTopLeft());
	}

}
