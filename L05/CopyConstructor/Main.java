class Memento {
	private int height, width; // for keeping originator�s state
	Rectangle orig;
	
	public Memento(Rectangle o) {
		orig = o;//object reference 
		this.height = o.getHeight();
		this.width = o.getWidth();
	}

	public void restore() {
		orig.setSize(this.getHeight(), this.getWidth());
	}
}


class Rectangle{
	private int height, width;
	
	public Rectangle(int h, int w){
		setSize(h, w);
	}

	public Rectangle(Rectangle r){ //Copy
		this.height = r.getHeight();
		this.width = r.getWidth();
	}

	public int getHeight(){return height;}
	public int getWidth(){return width;}

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
		Rectangle r2 = new Rectangle(r1); 
		
		System.out.println(r1);
		System.out.println(r2);
		
		r1.setSize(6,7);
		System.out.println(r2);
		
	}
}