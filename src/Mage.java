public class Mage {

    private String name;
    private int health;
    private int mana;
    protected MageSkills skills;

    // Mage Constructor
        Mage(String name) {
            this.name = name;
            this.health = 80;
            this.mana = 150;
            skills = new MageSkills();
        }
        // Allows our Mage to spawn
            void spawn() {
                System.out.printf("%s spawns in. %s has %d health and %d mana. " + "%s also has access to %s%n",
                        name, name, health, mana, name, skills);
             }

}