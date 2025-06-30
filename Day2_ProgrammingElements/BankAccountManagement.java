package Day2_ProgrammingElement.Level1;
class BankAccount{
	public long accountNumber;
	protected String accountHolder;
	private double balance;
	
	BankAccount(long accountNumber, String accountHolder, double balance){
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
	    if (amount > 0) {
	        balance += amount;
	        System.out.println("Deposited: " + amount);
	    } else {
	        System.out.println("Invalid amount.");
	    }
	}
	
    public void withdraw(double amount) {
	    if (amount > 0 && amount <= balance) {
	        balance -= amount;
	        System.out.println("Withdrawn: " + amount);
	    } else {
	        System.out.println("Invalid or insufficient balance.");
	    }
    }
    
    public double getbalance() {
		return balance;
	}

}

class SavingsAccount extends BankAccount{
	public SavingsAccount(long accountNumber, String accountHolder, double balance) {
		super(accountNumber, accountHolder, balance);
	}
	
	public void displayresults() {
		System.out.println();
		System.out.println("Account Number: "+ accountNumber);
		System.out.println("Account Holder: "+ accountHolder);
		System.out.println("Balance: "+getbalance());
	}
}
public class BankAccountManagement {

	public static void main(String[] args) {
		SavingsAccount savings = new SavingsAccount(345678934, "Raj", 5000.0);

        savings.displayresults();
        savings.deposit(1500.0);
        savings.withdraw(2000.0);

        System.out.println("Final Balance: " + savings.getbalance());

	}

}
