import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int health = 100;
        int gold = 0;
        boolean hasKey = false;
        boolean gameOver = false;
        
        System.out.println("Welcome to the Dragon's Lair Adventure!");
        System.out.println("----------------------------------------------");
        System.out.println("Your village is under attack! Defeat the dragon to save your people.");
        System.out.println("Health: " + health + " | Gold: " + gold + "\n");

 
        while (!gameOver) {
            System.out.println("\nChoose your action:");
            System.out.println("1. Explore the forest");
            System.out.println("2. Enter the cave");
            System.out.println("3. Visit the shop");
            System.out.println("4. Face the dragon");
            System.out.println("5. Quit game");
            System.out.print("Enter choice (1-5): ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("\nYou find a healing herb in the forest!");
                    health = Math.min(100, health + 20);
                    System.out.println("Health increased to: " + health);
                    break;
                    
                case 2:
                    if (!hasKey) {
                        System.out.println("\nYou discover a golden key in the cave!");
                        hasKey = true;
                    } else {
                        System.out.println("\nYou already have the key. Nothing else here.");
                    }
                    break;
                    
                case 3:
                    System.out.println("\nShopkeeper: '5 gold for a health potion!'");
                    if (gold >= 5) {
                        System.out.println("Do you want to buy? (1=Yes, 2=No)");
                        int buyChoice = scanner.nextInt();
                        
                        if (buyChoice == 1) {
                            gold -= 5;
                            health = Math.min(100, health + 30);
                            System.out.println("Health restored to: " + health);
                        } else {
                            System.out.println("Maybe next time!");
                        }
                    } else {
                        System.out.println("Not enough gold!");
                    }
                    break;
                    
                case 4:
                    System.out.println("\nThe dragon roars as you approach!");

                    String weaponStatus = hasKey ? "dragon-slaying sword" : "rusty dagger";
                    System.out.println("You attack with your " + weaponStatus + "!");

                    if (!hasKey) {
                        System.out.println("Your dagger breaks! The dragon burns you (-50 health)");
                        health -= 50;
                    } else if (Math.random() > 0.3) {
                        System.out.println("You slay the dragon! Victory!");
                        gold += 100;
                        gameOver = true;
                    } else {
                        System.out.println("The dragon dodges! You get burned (-30 health)");
                        health -= 30;
                    }
                    
                    System.out.println("Health: " + health);

                    if (health <= 0) {
                        System.out.println("You died! Game over.");
                        gameOver = true;
                    }
                    break;
                    
                case 5: 
                    System.out.println("\nThanks for playing!");
                    gameOver = true;
                    break;
                    
                default:
                    System.out.println("\nInvalid choice! Try again.");
            }

            if (!gameOver && Math.random() > 0.7) {
                int foundGold = (int)(Math.random() * 10) + 1;
                gold += foundGold;
                System.out.println("\nYou found " + foundGold + " gold on the ground!");
            }
            
            System.out.println("\nHealth: " + health + " | Gold: " + gold);
        }
        
        scanner.close();
    }
}
