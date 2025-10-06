public class Fireball extends Skills{

    //Components of Fireball
    private String name;
    private int damage;
    private int range;
    private int manaCost;

    //Constructing Fireball
    Fireball(String name) {
        super(name);
        this.name = name;
        this.damage = 20;
        this.range = 25;
        this.manaCost = 10;
    }

    //Allowing Fireball to be used
    public void use() {
        System.out.printf("%s is cast. It does %d damage, reaches %d ft, and uses %d mana.%n", name, damage, range, manaCost);
    }

}