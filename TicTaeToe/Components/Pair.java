package Components;

public class Pair<K1,K2> {
    private K1 a;
    private K2 b;

    public Pair(K1 a, K2 b)
    {
        this.a = a;
        this.b = b;
    }

    public K1 getA() {
        return a;
    }

    public K2 getB() {
        return b;
    }
}
