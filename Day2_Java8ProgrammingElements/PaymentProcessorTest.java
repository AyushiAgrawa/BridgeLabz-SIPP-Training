package JavaFeature.Day2_Java8ProgrammingElements;

interface PaymentProcessor {
    void pay(double amount);
    default void refund(double amount) {
        System.out.println("Refunded " + amount);
    }
}

class PayPal implements PaymentProcessor {
    public void pay(double amount) { System.out.println("Paid " + amount + " via PayPal"); }
}

public class PaymentProcessorTest {
    public static void main(String[] args) {
        PaymentProcessor p = new PayPal();
        p.pay(500);
        p.refund(200);
    }
}
