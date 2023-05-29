public abstract class Title implements Adventurer {
    protected Adventurer adventurer;

    public Title(Adventurer adventurer) {
        this.adventurer = adventurer;
    }

    public void attack() {
        adventurer.attack();
    }
}
