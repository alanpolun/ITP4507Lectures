class Rectangle{
	private int height, width;
	
	public Rectangle(int h, int w){
		setSize(h, w);
	}

	public void setSize(int h, int w){
		height = h;
		width = w;
	}	
	
	public String toString(){
		return "height:"+height+" width:"+width;
	}
}

public class Main {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(3,4);
		Rectangle r2 = r1;
		
		System.out.println(r1);
		System.out.println(r2);
		
		r1.setSize(6,7);
		System.out.println(r2);
		
	}
}