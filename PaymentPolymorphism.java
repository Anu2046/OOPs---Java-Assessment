import java.util.Scanner;

class Payment {
    void pay(double amount) {
        System.out.println("Processing generic payment of $" + amount);
    }
}

class CreditCard extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Credit Card: Paid $" + amount);
    }
}

class PayPal extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("PayPal: Paid $" + amount);
    }
}

class UPI extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("UPI: Paid ₹" + amount);
    }
}

public class PaymentPolymorphism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to pay: ");
        double amount = sc.nextDouble();

        System.out.println("Choose payment method: ");
        System.out.println("1) Credit Card  2) PayPal  3) UPI");
        int choice = sc.nextInt();

        Payment p;
        switch (choice) {
            case 1: p = new CreditCard(); break;
            case 2: p = new PayPal(); break;
            case 3: p = new UPI(); break;
            default: p = new Payment();
        }

        p.pay(amount);  // Runtime Polymorphism
        sc.close();
    }
}

