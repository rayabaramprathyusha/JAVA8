import java.time.*;
import java.time.format.DateTimeFormatter;

public class BirthdayCalculator {
    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(1995, 10, 28);
        LocalDate today = LocalDate.now();

        Period age=Period.between(dob,today);
        System.out.println(" Age: " +age.getYears()+ " years "+age.getMonths()+" months");

        LocalDate nextBirthday=dob.withYear(today.getYear());
        if (nextBirthday.isBefore(today)){
            nextBirthday=nextBirthday.plusYears(1);
        }
        long daysleft=Duration.between(today.atStartOfDay(),nextBirthday.atStartOfDay()).toDays();
        System.out.println("Next Birthday: "+nextBirthday);
        System.out.println("Days left: "+daysleft);
    }
}
