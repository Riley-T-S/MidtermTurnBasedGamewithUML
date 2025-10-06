import java.util.Random;

public class LightningBolt extends Skills{

    //Components of LightingBolt
    private String name;
    private int damage;
    private int range;
    private int manaCost;
    private int paralyzeChance;

    //Random generator for paralyze chance
    private Random random = new Random();

    //Initializing LightningBolt
    LightningBolt(String name) {
        super(name);
        this.name = name;
        this.damage = 50;
        this.range = 60;
        this.manaCost = 25;
        this.paralyzeChance = 30; //30% chance to paralyze
    }

    //Allowing LightningBolt to be used
    public void use() {
        System.out.printf("%s is cast. It does %d damage, reaches %d ft, and uses %d mana.%n", name, damage, range, manaCost);

        //Check to see if paralysis is applied
        if (random.nextInt(100) < paralyzeChance) {
            System.out.println("The target is paralyzed!");
        } else {
            System.out.println("The target is not paralyzed.");
        }
    }
}
