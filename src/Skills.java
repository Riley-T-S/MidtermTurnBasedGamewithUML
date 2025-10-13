public abstract class Skills {
    protected String name;

    public Skills(String name) {
        this.name = name;
    }

    // Overriding skill names to make them more readable
    @Override
    public String toString() {
        return name;
    }

    // Allows skills to be used
    public abstract void use();

}