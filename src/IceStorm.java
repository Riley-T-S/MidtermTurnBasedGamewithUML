public class IceStorm extends Skills {

    //Components of IceStorm
    private String name;
    private int damage;
    private int range;
    private int manaCost;

    //Constructing IceStorm
    IceStorm(String name) {
        super(name);
        this.name = name;
        this.damage = 100;
        this.range = 100;
        this.manaCost = 100;
    }

    //Allowing IceStorm to be used
    public void use() {
        System.out.printf("%s is cast. It does %d damage, reaches %d ft, and uses %d mana.%n", name, damage, range, manaCost);
    }
}
