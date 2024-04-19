package org.example.date_time;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Test7_DateTimeFormat {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("1993-09-18");
        System.out.println(localDate);
        String myDate = "18/09/1993";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(localDate.format(dateTimeFormatter));
    }
}
