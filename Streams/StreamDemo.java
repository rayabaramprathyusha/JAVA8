import java.util.*;

public class StreamDemo {
    public static void main(String[] args) {
       List<String> names=Arrays.asList("Anu","Radhan","Amulya","David");

       System.out.println("All names are:");
       names.forEach(System.out::println);

       System.out.println("names start with 'A' are : ");
       names.stream()
               .filter(name->name.startsWith("A"))
               .forEach(System.out::println);
    }
}
