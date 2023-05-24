public class Archer implements Adventurer{
    public String getType() {
        System.out.println("我是弓箭手");
        return this.getClass().getSimpleName();
    }
}
