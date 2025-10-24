import java.util.function.*;

public class FunctionChaining {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyBy2 = n -> n * 2;
        Function<Integer, Integer> add10 = n -> n + 10;

        // Chaining using andThen()
        Function<Integer, Integer> result = multiplyBy2.andThen(add10);

        System.out.println("Final Result: " + result.apply(5)); // (5*2)+10 = 20
    }
}
