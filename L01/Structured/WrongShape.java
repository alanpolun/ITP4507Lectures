public class WrongShape {
    private int type;
	public static final int CIRCLE = 0;
	public static final int SQUARE = 1;
	public static final int RECTANGLE = 2;
	
	public WrongShape(int type) { this.type = type; }
	
	public int getType() { return this.type; }
}
