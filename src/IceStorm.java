import java.util.Random;

public class IceStorm extends Skills {

    //Components of IceStorm
    private String name;
    private int damage;
    private int range;
    private int manaCost;
    private int freezeChance;

    //Random generator for freeze chance
    private Random random = new Random();

    //Constructing IceStorm
    IceStorm(String name) {
        super(name);
        this.name = name;
        this.damage = 100;
        this.range = 100;
        this.manaCost = 100;
        this.freezeChance = 30; //30% chance to freeze
    }

    //Allowing IceStorm to be used
    public void use() {
        System.out.printf("%s is cast. It does %d damage, reaches %d ft, and uses %d mana.%n", name, damage, range, manaCost);

        //Check to see if frozen is applied
        if (random.nextInt(100) < freezeChance) {
            System.out.println("The target is frozen!");
        } else {
            System.out.println("The target is not frozen");
        }
    }
}
