import java.util.*;

class Employee{
    String name;
    Double salary;
    public Employee(String name, Double salary){
        this.name = name;
        this.salary = salary;

    }
    @Override
    public String toString(){
        return "Student name: " + name + ", Salary: " + salary;
    }
}


public class EmployeeStreamFilter {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice",9000.00),
                new Employee("Bob",4500.00),
                new Employee("Vinil",7000.00)
        );

        System.out.println("Employees before filtering:");
        employees.forEach(System.out::println);

        System.out.println("Employees after filtering salaries greater than 5000:");
        employees.stream()
                .filter(emp->emp.salary > 5000)
                .forEach(emp->System.out.println(emp.name+" "+emp.salary));


    }
}
