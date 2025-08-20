import java.util.Scanner;

class Notification {
    void sendNotification() {
        System.out.println("You have a new notification!");
    }
}

class WhatsApp extends Notification {
    @Override
    void sendNotification() {
        System.out.println("WhatsApp: You got a new message!");
    }
}

class Instagram extends Notification {
    @Override
    void sendNotification() {
        System.out.println("Instagram: Someone liked your photo!");
    }
}

class YouTube extends Notification {
    @Override
    void sendNotification() {
        System.out.println("YouTube: New video uploaded from your subscription!");
    }
}

public class SocialMediaPolymorphism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an app to check notification:");
        System.out.println("1) WhatsApp  2) Instagram  3) YouTube");
        int choice = sc.nextInt();

        Notification n;
        switch (choice) {
            case 1: n = new WhatsApp(); break;
            case 2: n = new Instagram(); break;
            case 3: n = new YouTube(); break;
            default: n = new Notification();
        }

        n.sendNotification();  // Runtime Polymorphism
        sc.close();
    }
}
