interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " made using Credit Card.");
    }
}

class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " made using UPI.");
    }
}

class WalletPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " made using Wallet balance.");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment c1 = new CreditCardPayment();
        Payment u1 = new UPIPayment();
        Payment w1 = new WalletPayment();

        c1.pay(2000);
        u1.pay(750);
        w1.pay(500);
    }
}
