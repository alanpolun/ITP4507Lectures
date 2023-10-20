public class Main {

	public static void main(String[] arg) {
		Shape originator = new Shape(3, 4);
		Caretaker ct = new Caretaker();
		
		System.out.println(originator);
		ct.saveMyClass(originator); //backup orginator

		originator.setLocation(5,6);
		ct.saveMyClass(originator); //backup orginator
		System.out.println(originator);
		
		originator.setSize(33, 44);
		System.out.println(originator);
		
		ct.undo();
		System.out.println(originator);
		
		ct.undo();
		System.out.println(originator);
		
	}

}