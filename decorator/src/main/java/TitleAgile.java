public class TitleAgile extends Title{
    public TitleAgile(Adventurer adventurer) {
        super(adventurer);
    }

    @Override
    public void attack() {
        System.out.print("快速 ");
        super.attack();
    }

    public void useFlash() {
        System.out.println("使用瞬間移動 ");
    }
}
