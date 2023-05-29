public class TitleInFire extends Title{
    public TitleInFire(Adventurer adventurer) {
        super(adventurer);
    }

    @Override
    public void attack() {
        System.out.print("燃燒 ");
        super.attack();
    }

    public void fireball() {
        System.out.println("丟火球 ");
    }
}
