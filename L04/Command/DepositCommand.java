import java.util.*;

public class DepositCommand implements Command {
	Account acc;
	double amount;
	Scanner sc;
	public DepositCommand(Account account, Scanner sc) {
		this.acc = account;
		System.out.print("Deposit Amount: ");
		this.amount = sc.nextDouble();
	}
	
	public void execute() {
		System.out.println("---Deposit Transaction---");
		System.out.println(acc);
		System.out.println("Deposit Amount = " + amount);
		acc.deposit(amount);
		System.out.println("After deposit, balance = " + acc.getBalance());
		System.out.println("----End------");
	}
	
	public void undo() {
		System.out.println("---Undo Deposit Transaction---");
		System.out.println(acc);
		System.out.println("Deposit Amount = " + amount);
		acc.withdraw(amount);
		System.out.println("After undo deposit, balance = " + acc.getBalance());
		System.out.println("----End------");
		
	}

	public String toString() {
		return "Deposit: " + amount + " Account: " + acc.toString();
	}
}