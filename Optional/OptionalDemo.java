import java.util.*;
import java.util.stream.*;

public class OptionalDemo {
    public static void main(String[] args) {
        String name=null;
        Optional<String> Optname=Optional.ofNullable(name);

        System.out.println("Name: "+Optname.orElse("Guestuser"));

        Optname.ifPresent(n->System.out.println("Uppercase: "+n.toUpperCase()));
    }
}
