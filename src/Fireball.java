import java.util.Random;

public class Fireball extends Skills {

    // Components of Fireball
    private String name;
    private int damage;
    private int range;
    private int manaCost;
    private int burnChance;

    // Random generator for burn chance
    private Random random = new Random();

    // Constructing Fireball
    Fireball(String name) {
        super(name);
        this.name = name;
        this.damage = 20;
        this.range = 25;
        this.manaCost = 10;
        this.burnChance = 30; //30% chance to Burn
    }

    // Allowing Fireball to be used
    public void use() {
        System.out.printf("%s is cast. It does %d damage, reaches %d ft, and uses %d mana.%n", name, damage, range, manaCost);

        // Check to see if burn is applied
        if (random.nextInt(100) < burnChance) {
            System.out.println("The target is burned!");
        } else {
            System.out.println("The target is not burned.");
        }
    }
}