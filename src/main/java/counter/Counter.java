package counter;

public class Counter {
    public static int totalCounter = 0;
    public int instanceCounter = 0;

    @Override
    public String toString() {
        return "Counter:\n" +
                " instanceCounter: " + instanceCounter +
                ", totalCounter:" + totalCounter +
                '\n';
    }

    public void incrementInstanceCounter(int plus) {
        instanceCounter += plus;
    }

    public static void incrementTotalCounter(int plus) {
        totalCounter += plus;
    }
}
