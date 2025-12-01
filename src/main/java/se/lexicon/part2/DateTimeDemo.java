package se.lexicon.part2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

    void main(){
        LocalDate currentDate = LocalDate.now(); // 2025-12-01
        System.out.println("currentDate: " + currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println("currentTime = " + currentTime); // 08:00:00.0000

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("currentDateTime = " + currentDateTime); // yyyy-MM-ddTHH:MM:SS.MS

        LocalDate specificDate = LocalDate.of(2025,1,1);
        System.out.println("specificDate = " + specificDate);
        LocalDate specificDate2 = LocalDate.parse("2025-01-01");
        System.out.println("specificDate2 = " + specificDate2);

        System.out.println(currentDate.plusDays(1));

        System.out.println(LocalDate.now().isLeapYear());


        LocalDate yesterday = LocalDate.now().minusDays(1);
        System.out.println("yesterday = " + yesterday);
        System.out.println(yesterday.format(DateTimeFormatter.BASIC_ISO_DATE)); // YYYYMMDD
        System.out.println(yesterday.format(DateTimeFormatter.ofPattern("eeee dd MMM YYYY")));


    }
}
