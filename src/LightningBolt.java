public class LightningBolt extends Skills{

    //Components of LightingBolt
    private String name;
    private int damage;
    private int range;
    private int manaCost;

    //Initializing LightningBolt
    LightningBolt(String name) {
        super(name);
        this.name = name;
        this.damage = 50;
        this.range = 60;
        this.manaCost = 25;
    }

    //Allowing LightningBolt to be used
    public void use() {
        System.out.printf("%s is cast. It does %d damage, reaches %d ft, and uses %d mana.%n", name, damage, range, manaCost);
    }
}
