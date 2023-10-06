import java.util.*;

public interface Command {
	public abstract void execute();
	public abstract void undo();
}

class DepositCommand implements Command {
	Account acc;
	double amount;
	Scanner sc;
	public DepositCommand(Account account,Scanner sc) {
		this.acc = account;
		this.sc = sc;
	}
	
	public void execute() {
		System.out.print("Deposit Amount: ");
		amount = sc.nextDouble();
		acc.deposit(amount);
		System.out.println("After deposit:");
		System.out.println(acc);
		System.out.println("----End------");
	}
	
	public void undo() {
		System.out.println("---Undo Deposit Transaction---");
		System.out.println(acc);
		System.out.println("Deposit Amount = "+amount);
		acc.withdraw(amount);
		System.out.println("After undo deposit, balance = " + acc.getBalance());
		System.out.println("----End------");
	}
}

class WithdrawCommand implements Command {
	Account acc;
	double amount;
	Scanner sc;
	public WithdrawCommand(Account account, Scanner sc) {
		this.acc = account;
		this.sc = sc;
	}
	
	public void execute() {
		System.out.print("Withdraw Amount: ");
		amount = sc.nextDouble();
		acc.withdraw(amount);
		System.out.println("After withdraw:");
		System.out.println(acc);
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
}