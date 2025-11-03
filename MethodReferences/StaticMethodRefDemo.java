import java.util.*;
import java.util.stream.*;

public class StaticMethodRefDemo {

    public static String convertToUpper(String str){
        return str.toUpperCase();
    }
    public static void main(String[] args) {
        List<String> names=Arrays.asList("anu","janu","Chinnu");

        names.stream()
                .map(StaticMethodRefDemo::convertToUpper)
                .forEach(System.out::println);
    }
}
