package counter;

import static counter.Calculator.*;
import counter.Counter;

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

        System.out.println("Die Summe ist: " + add(3,23));
        System.out.println("Die Subtraktion ist: " + subtraction(54,23));
        System.out.println("Die Produkt ist: " + multiplication(3,23));
        System.out.println("Die Division ist: " + division(3,23));

    }
}
