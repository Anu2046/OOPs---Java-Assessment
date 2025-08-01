import java.util.Scanner;

public class FriendlyGreeting {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hello! What's your name?");
        String name = input.nextLine();
        
        System.out.println("How old are you?");
        int age = input.nextInt();
        
        input.nextLine();
        
        System.out.println("What's your favorite color?");
        String color = input.nextLine();
        
        System.out.println("\n--- Your Profile ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Favorite Color: " + color);
        System.out.println("---------------------");
        System.out.println("\nNice to meet you, " + name + "!");
        System.out.println("I also like the color " + color + "!");
        
        input.close();
    }
}
