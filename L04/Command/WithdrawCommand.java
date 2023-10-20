import java.util.*;

public class WithdrawCommand implements Command {
	Account acc;
	double amount;
	Scanner sc;
	public WithdrawCommand(Account account, Scanner sc) {
		this.acc = account;
		System.out.print("Withdraw Amount: ");
		this.amount = sc.nextDouble();
	}
	
	public void execute() {
		System.out.println("---Withdraw Transaction---");
		System.out.println(acc);
		System.out.println("Withdraw Amount = " + amount);
		acc.withdraw(amount);
		System.out.println("After uithdraw, balance = " + acc.getBalance());
		System.out.println("----End------");
	}
	
	public void undo() {
		System.out.println("---Undo Withdraw Transaction---");
		System.out.println(acc);
		System.out.println("Withdraw Amount = " + amount);
		acc.deposit(amount);
		System.out.println("After undo uithdraw, balance = " + acc.getBalance());
		System.out.println("----End------");
		
	}

	public String toString() {
		return "Withdraw: " + amount + " Account: " + acc.toString();
	}
}