import java.util.*;
import java.util.stream.*;

class Product{
    String category;
    double price;
    public Product(String category, double price) {
        this.category = category;
        this.price = price;
    }
    @Override
    public String toString() {
        return "category=" + category + ", price=" + price;
    }
}

public class SalesAnalytics {
    public static void main(String[] args) {
        List<Product> products =Arrays.asList(
                new Product("Electronics",2000),
                new Product("Clothing",3000),
                new Product("Electronics",5000),
                new Product("Grocery",500)
        );
        System.out.println("All Sales");
        products.forEach(System.out::println);

        Map<String, Double> revenue = products.stream()
                .collect(Collectors.groupingBy(p->p.category,Collectors.summingDouble(p->p.price)));

        System.out.println("Total revenue by category : "+revenue);
    }
}
