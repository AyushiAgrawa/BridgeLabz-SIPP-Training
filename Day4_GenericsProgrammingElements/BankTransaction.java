package Generics.Day4_GenericsProgrammingElements;
import java.util.*;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    double balance;
    BankAccount(double balance) {
        this.balance = balance;
    }
    void withdraw(double amount) throws InsufficientBalanceException {
        if(amount < 0) throw new IllegalArgumentException("Invalid amount!");
        if(amount > balance) throw new InsufficientBalanceException("Insufficient balance!");
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

public class BankTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount(1000);
        System.out.print("Enter amount to withdraw: ");
        double amt = sc.nextDouble();
        try {
            acc.withdraw(amt);
        } catch (InsufficientBalanceException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
