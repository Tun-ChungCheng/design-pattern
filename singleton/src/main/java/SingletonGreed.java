public class SingletonGreed {
    private static SingletonGreed instance = new SingletonGreed();

    private SingletonGreed() {}

    public static SingletonGreed getInstance() {
        return instance;
    }
}
