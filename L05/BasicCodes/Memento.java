public class Memento {
	private int state; // for keeping originator�s state
	Originator orig;
	
	public Memento(Originator o) {
		orig = o;//object reference 
		state = orig.state; // save originator�s state
	}

	public void restore() {
		orig.state = this.state;
	}
}