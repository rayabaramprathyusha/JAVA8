import java.util.*;
import java.util.stream.*;

public class ArbitraryMethodRefDemo {
    public static void main(String[] args) {
        List<String> cities= Arrays.asList("Dallas","Newyork","Chicago");

        cities.stream()
                .map(String::length)
                .forEach(System.out::println);
    }
}
