import java.util.*;
import java.util.function.*;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeFilter {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 70000),
                new Employee("Bob", 45000),
                new Employee("Charlie", 85000)
        );

        Predicate<Employee> highEarner = e -> e.salary > 60000;

        System.out.println("High earning employees:");
        employees.stream()
                .filter(highEarner)
                .forEach(e -> System.out.println(e.name + " earns " + e.salary));
    }
}
