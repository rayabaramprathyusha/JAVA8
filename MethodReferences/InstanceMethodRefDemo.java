import java.util.*;

public class InstanceMethodRefDemo {
    public void printNames(String name){
        System.out.println(name);
    }

    public static void main(String[] args){
        InstanceMethodRefDemo obj=new InstanceMethodRefDemo();

        List<String> names=Arrays.asList("Raj","Bun","Cin");
        names.forEach(System.out::println);
    }
}
