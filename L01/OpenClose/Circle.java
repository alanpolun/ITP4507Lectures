import java.awt.Point;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius, Point center) {
		super(center);
		this.radius = radius;
	}
	
	public double getRadius() { return this.radius; }
	
	public Point getCenter() {return super.getTopLeft();}
	
	public Point getTopLeft(){return null;}
	
	public void draw(){
		System.out.println("Circle Detail:");
		System.out.println("Radius:" + getRadius());
		System.out.println("Center:" + getCenter());
	}
	
}
