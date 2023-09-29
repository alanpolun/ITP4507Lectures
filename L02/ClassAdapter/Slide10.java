interface Target {
  abstract public void request();
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

class Adapter extends Adaptee implements Target {
  public void request() {
     specificRequest();
  }
  
}

class Adaptee {
  public void specificRequest(){
  	System.out.println("Something you want to adapt!");
  }
}

public class Slide10 {
	public static void main(String[] args) {
    	Client client = new Client(new Adapter());
    	client.someMethod();
	}
}