import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

class Employee{
    String name;
    double salary;

    Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
}
public class PayrollParallel {
    public static void main(String[] args) {
        List<Employee> emplist=new ArrayList<>();
        for(int i=1;i<10;i++){
            emplist.add(new Employee("Emp: "+i, ThreadLocalRandom.current().nextDouble(50000,100000)));
        }
        emplist.parallelStream().forEach(emp->{
            double bonus=emp.salary*0.10;
            System.out.println(Thread.currentThread().getName()+"|"+emp.name+"-> Bonus  |"+bonus);

        });

    }
}
