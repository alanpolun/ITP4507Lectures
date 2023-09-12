import java.awt.Point;

public class Square extends Shape {
	private double side;

	public Square(double side, Point topLeft) {
		super(topLeft);
		this.side = side;
	}
	
	public double getSide() { return this.side; }
	
	public void draw(){
		System.out.println("Square Detail:");
		System.out.println("Side:" + getSide());
		System.out.println("Top Left:" + super.getTopLeft());
	}
	
}