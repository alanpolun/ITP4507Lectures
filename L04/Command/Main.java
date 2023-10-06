import java.util.*;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Account acc = new Account(1, 2000);
		//double amount = 0;
		Command com;
		Stack<Command> commandStack = new Stack<Command>();
		
        int command;
        while (true) {
            System.out.println("Enter command: \n0 = exit, 1 = deposit, 2 = withdraw, "+
            	"\n3 = undo last transaction, 4 = show account balance");
            command = sc.nextInt();
        	switch (command) {
	            case 0:
	            	System.exit(0);
	            case 1:
	            	com = new DepositCommand(acc, sc);
	            	com.execute();
					commandStack.push(com);
					break;
	            case 2:
	            	com = new WithdrawCommand(acc, sc);
	            	com.execute();
					commandStack.push(com);
			        break;
	            case 3:
					System.out.println();
					// undo the commands
					if (!commandStack.empty()) {
						// get the latest command in the stack
						Command c = (Command) commandStack.pop();
						// undo the latest command
						c.undo();
					} else {
						System.out.println("Nothing to undo!");
					}
	                break;
	            case 4:
	            	System.out.println(acc);
	            	break;
	            default:
	            	System.out.println("Error on your input!");
        	}
        }
	}
}
