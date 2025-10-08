import java.util.ArrayList;

// Making an Array list to sort the spells
public class MageSkills {
    ArrayList<Skills> spells = new ArrayList<>();

    public MageSkills() {
        // Add spells to list
        spells.add(new Fireball("Fireball"));
        spells.add(new LightningBolt("Lightning Bolt"));
        spells.add(new IceStorm("Ice Storm"));

    }

    public Skills get(int i) {
        return spells.get(i);
    }
    // Allows Mage Skills to be included when creating a Mage
    @Override
    public String toString() {
        String spellNames = "";
        for (Skills spell : spells)
        {

        spellNames += spell.name + ", ";
        }

        return "Mage Skills: " + spellNames;

    }

}