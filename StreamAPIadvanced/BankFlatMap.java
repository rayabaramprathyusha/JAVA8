import java.util.*;
import java.util.stream.*;

class Customer{
    String name;
    List<Double> transactions;
    public Customer(String name, List<Double> transactions) {
        this.name = name;
        this.transactions = transactions;
    }
    @Override
    public String toString() {
        System.out.println("Customer name : "+name);
        System.out.println("Customer transactions : "+transactions);
        return "";
    }
}

public class BankFlatMap {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
                new Customer("Jack",Arrays.asList(100.0,200.0)),
                new Customer("Eli",Arrays.asList(500.0,700.0))
        );

        System.out.println("Customers and their transactions : ");
        customers.forEach(System.out::println);

        customers.stream()
                .flatMap(c->c.transactions.stream())
                .forEach(System.out::println);
    }
}
