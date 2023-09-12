public class WrongClient {
	public static void drawAllShape(WrongShape[] shapes) {
		for (WrongShape s:shapes) {
			switch (s.getType()) {
				case WrongShape.SQUARE:
					drawSquare((WrongSquare) s);
					break;
				case WrongShape.CIRCLE:
					drawCircle((WrongCircle) s);
					break;
			}
			System.out.println();
		}
	}

    public static void drawSquare(WrongSquare s){
		System.out.println("Square Detail:");
		System.out.println("Side:" + s.getSide());
		System.out.println("Top Left:" + s.getTopLeft());
	}
	
	public static void drawCircle(WrongCircle c){
		System.out.println("Circle Detail:");
		System.out.println("Radius:" + c.getRadius());
		System.out.println("Center:" + c.getCenter());
	}

}

