import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creating a new Mage named Rune
        Mage magicUser = new Mage("Rune");

        magicUser.spawn();

        Scanner scanner = new Scanner(System.in);
        MageSkills mageSkills = new MageSkills();


        while (true) {
            System.out.print("Enter the name of the spell you want to cast (or type 'quit' to exit): ");
            String input = scanner.nextLine().trim(); // Read input and remove extra spaces

            // Check if the user wants to quit
            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Exiting spell casting.");
                break; // Exit the loop
            }

            Skills chosenSpell = null;

            // Search for a spell with a matching name (case-insensitive)
            for (Skills spell : mageSkills.spells) {
                if (spell.name.equalsIgnoreCase(input)) {
                    chosenSpell = spell; // Spell found
                    break;
                }
            }

            if (chosenSpell != null) {
                System.out.println("You chose to cast: " + chosenSpell.name);
                chosenSpell.use();
            } else {
                System.out.println("Spell not found. Please enter a valid spell name.");
            }
        }

        scanner.close();

    }
}

// need more loops

// needs to be interactive