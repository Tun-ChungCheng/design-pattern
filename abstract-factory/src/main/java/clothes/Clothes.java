package clothes;

public abstract class Clothes {
    protected int def;

    public void display () {
        System.out.println(this.getClass().getSimpleName() +
                " def = " + def);
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }


}
