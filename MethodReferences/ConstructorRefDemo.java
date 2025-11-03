import java.util.function.Supplier;

class Employee{
    Employee(){
        System.out.println("Employee object created");
    }
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        Supplier<Employee> emp=Employee::new;
        emp.get();
    }
}
