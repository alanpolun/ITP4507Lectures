public class Main {

	public static void main(String[] arg) {
		Caretaker ct = new Caretaker();
		
		Originator originator = new Originator();
		System.out.println("state = " + originator.getState());
		ct.saveMyClass(originator);

		originator.action(); // the action changes originator's state
		System.out.println("state = " + originator.getState());
		ct.saveMyClass(originator);
		
		originator.action(); // the action changes originator's state
		System.out.println("state = " + originator.getState());
		
		ct.undo(); // restore originator's state 
		System.out.println("state after restore = " + originator.getState());

		ct.undo(); // restore originator's state 
		System.out.println("state after restore = " + originator.getState());

	}

}