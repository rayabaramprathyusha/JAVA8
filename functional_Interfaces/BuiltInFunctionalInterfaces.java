import java.util.function.*;

public class BuiltInFunctionalInterfaces {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 10 even? " + isEven.test(10));

        Function<String, Integer> strLength = s -> s.length();
        System.out.println("Length of 'Java': " + strLength.apply("Java"));

        Consumer<String> printMsg = msg -> System.out.println("Message: " + msg);
        printMsg.accept("Welcome to Functional Interfaces!");

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Random Value: " + randomValue.get());
    }
}
