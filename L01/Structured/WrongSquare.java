import java.awt.Point;

public class WrongSquare extends WrongShape {
	private double side;
	private Point topLeft;
	
	public WrongSquare(int type, double side, Point topLeft) {
		super(type);
		this.side = side;
		this.topLeft = topLeft;
	}
	
	public double getSide() { return this.side; }
	
	public Point getTopLeft() { return this.topLeft; }
	
}