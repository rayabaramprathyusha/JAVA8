import java.util.*;
class Product {
    String name;
    double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + '}';
    }

}
public class ProductDiscount {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop",1000),
                new Product("TV",600),
                new Product("Refrigerator",1100)
        );

        System.out.println("Actual item prices before discount :");
        products.forEach(System.out::println);


        System.out.println("Actual item prices after 10% discount :");
        products.stream()
                .map(p -> "Product name=" +p.name + " Discounted price: " +p.price*0.9)
                .forEach(System.out::println);
    }
}
