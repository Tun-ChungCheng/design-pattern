public class TitleStrong extends Title {
    public TitleStrong(Adventurer adventurer) {
        super(adventurer);
    }

    @Override
    public void attack() {
        System.out.print("猛力 ");
        super.attack();
    }
}
