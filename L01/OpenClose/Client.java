
public class Client {
	public static void drawAllShape(Shape[] shapes) {
		for (Shape s:shapes) {
			s.draw();
			System.out.println();
		}
	}
	
}