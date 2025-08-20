import java.util.Scanner;

class Character {
    String name;

    Character(String name) {
        this.name = name;
    }

    void introduce() {
        System.out.println("Hello, I am " + name + "!");
    }
}

class Fairy extends Character {
    int sparklePower;

    Fairy(String name, int sparklePower) {
        super(name);
        this.sparklePower = sparklePower;
    }

    void castMagic() {
        System.out.println(name + " sprinkles fairy dust! Sparkle power: " + sparklePower);
    }
}

class PrincessFairy extends Fairy {
    String magicBook;

    PrincessFairy(String name, int sparklePower, String magicBook) {
        super(name, sparklePower);
        this.magicBook = magicBook;
    }

    void readMagicBook() {
        System.out.println(name + " opens her magic book: '" + magicBook + "'");
    }

    void royalBlessing() {
        System.out.println(name + " gives a Royal Blessing spreading happiness everywhere!");
    }
}

public class FairyAdventure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your fairy name: ");
        String fairyName = sc.nextLine();

        System.out.print("Enter your sparkle power (1-100): ");
        int sparkle = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter the title of your magic book: ");
        String book = sc.nextLine();

        PrincessFairy fairy = new PrincessFairy(fairyName, sparkle, book);

        System.out.println("\nWelcome to the Fairy Tale Adventure!");
        fairy.introduce();

        boolean playing = true;
        while (playing) {
            System.out.println("\nChoose an action:");
            System.out.println("1) Sprinkle Magic Dust");
            System.out.println("2) Read from Magic Book");
            System.out.println("3) Give a Royal Blessing");
            System.out.println("4) Exit Game");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    fairy.castMagic();
                    break;
                case 2:
                    fairy.readMagicBook();
                    break;
                case 3:
                    fairy.royalBlessing();
                    break;
                case 4:
                    System.out.println("Goodbye, Princess Fairy " + fairy.name + "!");
                    playing = false;
                    break;
                default:
                    System.out.println("Choose a valid option, sweet fairy!");
            }
        }

        sc.close();
    }
}
