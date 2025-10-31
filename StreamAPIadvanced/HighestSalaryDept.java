import  java.util.*;
import java.util.stream.*;

class Emp{
    String dept;
    double salary;
    public Emp(String dept, double salary) {
        this.dept = dept;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "emp dept=" + dept + ", salary=" + salary;
    }
}


public class HighestSalaryDept {
    public static void main(String[] args) {
        List<Emp> emps = Arrays.asList(
                new Emp("HR",5000),
                new Emp("IT",7000),
                new Emp("HR",3000),
                new Emp("IT",9000)
        );

        System.out.println("All departments and their salary");
        emps.forEach(System.out::println);

        Map<String, Optional<Emp>> highest=emps.stream()
                .collect(Collectors.groupingBy(
                        emp -> emp.dept,
                        Collectors.maxBy(Comparator.comparing(emp -> emp.salary))));
        System.out.println("Highest");

    }
}
