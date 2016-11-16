public class Singleton {

    private static final Singleton instance = new Singleton();

    private int data;

    private Singleton() {
        // ...
    }

    public static Singleton getInstance() {
        return instance;
    }

    public int getLimit() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
