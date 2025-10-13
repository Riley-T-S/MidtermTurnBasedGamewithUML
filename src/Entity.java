public class Entity {
    // Common properties among Entities
    protected String name;
    protected int health;
    protected int mana;

    // Constructor for all Entities
    public Entity(String name, int health, int mana) {
        this.name = name;
        this.health = health;
        this.mana = mana;
    }
}
