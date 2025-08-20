import java.util.Scanner;

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("This animal makes a sound.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}

public class AnimalGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an animal (dog/cat): ");
        String choice = sc.nextLine().toLowerCase();

        System.out.println("Give your pet a name: ");
        String petName = sc.nextLine();

        Animal pet;
        if (choice.equals("dog")) {
            pet = new Dog(petName);
        } else {
            pet = new Cat(petName);
        }

        pet.makeSound();
        sc.close();
    }
}
