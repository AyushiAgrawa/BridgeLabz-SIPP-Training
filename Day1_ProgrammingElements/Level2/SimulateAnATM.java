package Day1_ProgrammingElements.Level2;
import java.util.*;
class BankAccount{
	private String accountHolder;
	private int accountNumber;
	private double balance;
	
	public BankAccount(String AccountHolder, int AccountNumber, double Balance) {
		this.accountHolder = AccountHolder;
		this.accountNumber= AccountNumber;
		this.balance = Balance;
	}
	
	public void depositing(double depositing) {
		balance += depositing;
		System.out.println("You depositied "+depositing+ " money");
		System.out.println("Your total money is "+balance);
	}
	
	public void  withdrawing(double withdrawing) {
		if(balance < 0) {
			return;
		}else if (withdrawing > balance) {
            System.out.println("Withdrawal failed. Not enough balance.");
        }else {
			balance -= withdrawing;
			System.out.println("You are withdrawing "+ withdrawing +  " money");
			System.out.println("you have remaining balance "+balance);
		}
	}
	
	public void displayresults() {
		System.out.println();
		System.out.println("The Account Holder is "+ accountHolder);
		System.out.println("The Account Number is "+ accountNumber);
		System.out.println("The balance is "+ balance);
		System.out.println();
	}
}
public class SimulateAnATM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of Account Holder: ");
		String accountHolder = sc.nextLine();
		System.out.println("Enter the number of Account : ");
		int accountNumber = sc.nextInt();
		System.out.println();
		double balance = 10000;
		BankAccount bankaccount = new BankAccount(accountHolder, accountNumber, balance);
		
		int choice;
        do {
            System.out.println("\n===== ATM details =====");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Display Account Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    bankaccount.depositing(deposit);
                    break;
                    
                case 2:
                	System.out.println("Enter amount to withdraw: ");
                	double withdraw = sc.nextDouble();
                	bankaccount.withdrawing(withdraw);
                	break;
               
                case 3:
                	System.out.println("The details are ");
                	bankaccount.displayresults();
                	break;
                
                case 4:
                	System.out.println("exit");
                	break;
                	
                default :
                	System.out.println("Invalid choice");
            }
        }while(choice != 4);  
		
	}

}
