class SquarePeg {
	public void insert(String str) {
		System.out.println("SquarePeg insert(): " + str);
	}
}

class RoundPeg {
	public void insertIntoHole(String msg) {
		System.out.println("RoundPeg insertIntoHole(): " + msg);
	}
}

class PegAdapter extends SquarePeg {
	private RoundPeg roundPeg;
	public PegAdapter(RoundPeg peg) {
		this.roundPeg = peg;
	}
	public void insert(String str) {
		roundPeg.insertIntoHole(str);
	}
}

public class TestPegs {
	public static void main(String[] args) {
		RoundPeg roundPeg = new RoundPeg();
		SquarePeg squarePeg = new SquarePeg();
		// Do an insert using the square peg.
		squarePeg.insert("Inserting square peg...");
		// Create a PegAdapter
		SquarePeg adapter = new PegAdapter(roundPeg);
		adapter.insert("Inserting round peg...");	}
}