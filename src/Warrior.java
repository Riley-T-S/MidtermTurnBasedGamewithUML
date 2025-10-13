public class Warrior extends Entity {
    private String name;
    private int health;
    private int mana;
    protected WarriorSkills skills;

    // Warrior Constructor
    Warrior(String name, int health, int mana) {
        super(name, health, mana);
        this.name = name;
        this.health = 80;
        this.mana = 150;
        skills = new WarriorSkills();
    }
}
