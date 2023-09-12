import java.awt.Point;

public abstract class Shape {
	private Point topLeft;

	public Shape(Point topLeft) {
		this.topLeft = topLeft;
	}
	
	public Point getTopLeft() { return this.topLeft; }

	public abstract void draw();
}
