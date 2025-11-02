import java.util.*;

class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(String message){
        super(message);
    }
}
public class EmployeeSearch {
    public static void main(String[] args) {
        List<String> employees=Arrays.asList("Anu","Anand","Viraj");

        Optional<String> result=employees.stream()
                .filter(emp->emp.equals("Vinay"))
                .findFirst();
        //String emp=result.orElse("Employee not found");
        String emp=result.orElseThrow(()->
                new EmployeeNotFoundException("Employee Not Found"));
        System.out.println(emp);
    }
}
