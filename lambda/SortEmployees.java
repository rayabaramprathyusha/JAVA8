import java.util.*;

class Employee {
    String name;
    double salary;
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class SortEmployees {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 50000),
                new Employee("Bob", 70000),
                new Employee("Charlie", 40000)
        );

        employees.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));

        employees.forEach(e -> System.out.println(e.name + ": " + e.salary));
    }
}
