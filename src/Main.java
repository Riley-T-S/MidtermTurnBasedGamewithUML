public class Main {
    public static void main(String[] args) {
        //Creating a new Mage named Rune
        Mage magicUser = new Mage("Rune");

        magicUser.spawn();
        magicUser.skills.get(0).use();
        magicUser.skills.get(1).use();
        magicUser.skills.get(2).use();

    }
}
