class CreditCard implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using credit card");
    }
}

class PayPal implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}

class Checkout {
    private PaymentStrategy strategy;
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(int amount) {
        strategy.pay(amount);
    }
}

public class Pay {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();
        checkout.setStrategy(new CreditCard());
        checkout.pay(100); // 출력: Paid 100 using credit card

        checkout.setStrategy(new PayPal());
        checkout.pay(200); // 출력: Paid 200 using PayPal
    }
}