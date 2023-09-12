import java.awt.Point;

public class WrongCircle extends WrongShape {
	private double radius;
	private Point center;
	
	public WrongCircle(int type, double radius, Point center) {
		super(type);
		this.radius = radius;
		this.center = center;
	}
	
	public double getRadius() { return this.radius; }
	
	public Point getCenter() { return this.center; }
	
}
