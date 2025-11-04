import java.util.*;


public class ParallelDemo {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Sequential:");
        numbers.stream()
                .forEach(n->System.out.println(Thread.currentThread().getName()+"->"+n));

        System.out.println("Parallel:");
        numbers.parallelStream()
                .forEach(n->System.out.println(Thread.currentThread().getName()+"->"+n));
    }
}
