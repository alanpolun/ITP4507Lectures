class Target {
	public void request(){
		System.out.println("Something for target!");	
	}
}

class Adaptee {
  public void specificRequest(){
  	System.out.println("Something you want to adapt!");
  }
}

class Adapter extends Target {
  Adaptee adaptee;
  public Adapter(Adaptee adaptee) {
    this.adaptee = adaptee; //object reference
  }
  
  @Override
  public void request() {
     adaptee.specificRequest();
  }
}

class Client {
  Target target;
  public Client(Target adapter) {
  	target = adapter;
  }
  
  public void someMethod() {
    target.request();
  }
}

public class Slide14 {
	public static void main(String[] args) {
    	Client client = new Client(new Target());
    	client.someMethod();
	}
}