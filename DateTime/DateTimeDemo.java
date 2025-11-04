import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.of(today, now);

        System.out.println("Today's date: "  +  today.toString());
        System.out.println("Today's time: "  +  dateTime);
        System.out.println("Today's Date and Time: "  +  dateTime.toLocalTime());

        LocalDate future=today.plusDays(10);
        System.out.println("Future's date after 10 days: " + future);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Formatted date: " + dateTime.format(formatter));

    }
}
