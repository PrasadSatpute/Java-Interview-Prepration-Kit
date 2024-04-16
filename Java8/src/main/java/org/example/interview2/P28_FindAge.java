package org.example.interview2;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class P28_FindAge {
    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(1993, 9, 18);
        LocalDate today = LocalDate.now();

        System.out.println(ChronoUnit.YEARS.between(birthDay, today));
    }
}
