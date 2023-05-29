public class Lancer implements Adventurer{
    private String name;

    public Lancer(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println("長槍攻擊 by " + name);
    }
}
