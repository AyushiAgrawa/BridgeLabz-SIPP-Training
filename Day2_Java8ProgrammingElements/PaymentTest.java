package JavaFeature.Day2_Java8ProgrammingElements;

interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) { System.out.println("Paid " + amount + " via UPI"); }
}

class CreditCard implements Payment {
    public void pay(double amount) { System.out.println("Paid " + amount + " via Credit Card"); }
}

class Wallet implements Payment {
    public void pay(double amount) { System.out.println("Paid " + amount + " via Wallet"); }
}

public class PaymentTest {
    public static void main(String[] args) {
        Payment[] payments = {new UPI(), new CreditCard(), new Wallet()};
        for(Payment p : payments) p.pay(1000);
    }
}
