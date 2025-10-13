import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creating a new Mage named Rune
        Mage magicUser = new Mage("Rune");

        magicUser.spawn();

        Scanner scanner = new Scanner(System.in);
        MageSkills mageSkills = new MageSkills();

        //This loop allows for the use of Mage Skills
        while (true) {
            System.out.print("Enter the name of the skill you want to use (or type 'quit' to exit): ");
            // Read input and remove extra spaces
            String input = scanner.nextLine().trim();

            // Check if the user wants to quit
            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Exiting skill usage.");
                // Exit the loop
                break;
            }

            Skills chosenSpell = null;

            // Search for a spell with a matching name (case-insensitive)
            for (Skills spell : mageSkills.spells) {
                if (spell.name.equalsIgnoreCase(input)) {
                    // Spell found
                    chosenSpell = spell;
                    break;
                }
            }

            if (chosenSpell != null) {
                System.out.println("You chose to use: " + chosenSpell.name);
                chosenSpell.use();
            } else {
                System.out.println("Spell not found. Please enter a valid spell name.");
            }
        }

        scanner.close();

    }
}