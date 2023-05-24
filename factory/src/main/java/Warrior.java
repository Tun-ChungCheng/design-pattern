public class Warrior implements Adventurer{
    public String getType() {
        System.out.println("我是鬥士");
        return this.getClass().getSimpleName();

    }
}
