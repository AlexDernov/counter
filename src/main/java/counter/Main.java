package counter;

public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter.incrementTotalCounter(2);
        //oder

        counter1.incrementTotalCounter(4);
        counter2.incrementTotalCounter(1);

        counter1.incrementInstanceCounter(2);
        counter2.incrementInstanceCounter(3);
        System.out.println(counter1);
        System.out.println(counter2);

    }
}
