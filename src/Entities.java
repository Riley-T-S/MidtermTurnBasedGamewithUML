import java.util.ArrayList;

public abstract class Entities {
    // All PC's and enemies fall under the Entities Class
    ArrayList<Entities> entity = new ArrayList<>();

    //TODO:
    public Entities() {
        // Add entities to Array List
        entity.add(new Entity("Mage"));
        entity.add(new Warrior("Warrior"));
    }


}
