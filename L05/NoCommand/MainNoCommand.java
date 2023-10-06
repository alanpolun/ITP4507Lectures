package L05.NoCommand;
import java.util.*;

public class MainNoCommand {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Account acc = new Account(1, 2000);
		double amount = 0;
		Stack commandStack = new Stack();
		
        int command;
        while (true) {
            System.out.println("\nEnter command: \n0 = exit, 1 = deposit, 2 = withdraw, "+
            	"\n3 = undo last transaction, 4 = show account balance");
            command = sc.nextInt();
        	switch (command) {
	            case 0:
	            	System.exit(0);
	            case 1:
					System.out.print("Deposit Amount: ");
					amount = sc.nextDouble();
					acc.deposit(amount);
					System.out.println("After deposit:");
					System.out.println(acc);
					System.out.println("----End------");              
					// save the deposit command in the stack for undo
					commandStack.push(new Double(amount));
					commandStack.push(acc);
					commandStack.push("deposit");
	
					break;
	            case 2:
	        		System.out.print("Withdraw Amount: ");
					amount = sc.nextDouble();
					acc.withdraw(amount);
					System.out.println("After withdraw:");
					System.out.println(acc);
					System.out.println("----End------"); 
					// save the withdraw command in the stack for undo
					commandStack.push(new Double(amount));
					commandStack.push(acc);
					commandStack.push("withdraw");
			        break;
	            case 3:
					System.out.println();
					// undo the commands
					if (!commandStack.empty()) {
						// get the latest command in the stack
						String c = (String) commandStack.pop();
						if (c.equals("deposit")) {
							Account account = (Account) commandStack.pop();
							amount = ((Double) commandStack.pop()).doubleValue();
							System.out.println("---Undo Deposit Transaction---");
							System.out.println(account);
							System.out.println("Deposit Amount = " + amount);
							account.withdraw(amount);
							System.out.println("After undo deposit, balance = " + account.getBalance());
							System.out.println("----End------");			
						} else if (c.equals("withdraw")) {
							Account account = (Account) commandStack.pop();
							amount = ((Double) commandStack.pop()).doubleValue();
							System.out.println("---Undo Withdraw Transaction---");
							System.out.println(account);
							System.out.println("Withdraw Amount = " + amount);
							account.deposit(amount);
							System.out.println("After undo withdraw, balance = " + account.getBalance());
							System.out.println("----End------");
						}
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