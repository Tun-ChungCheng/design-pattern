public class Singleton {

    private static Singleton instance;

    private Singleton() {
        // 很多code，耗資源
    }

    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
