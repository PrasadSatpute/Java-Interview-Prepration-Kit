package org.example.date_time;

import java.time.LocalDate;
import java.time.Month;

public class Test1_LocalDate {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate customDate = LocalDate.of(1993,9,18);
        System.out.println(customDate);
        int dayOfMonth = now.getDayOfMonth();
        Month month = now.getMonth();
        int intMonth = now.getMonthValue();
        int year = now.getYear();
        System.out.println(dayOfMonth);
        System.out.println(month+ " " +intMonth);
        System.out.println(year);
        LocalDate yesterday = now.minusDays(1);
        System.out.println("Yesterday = " + yesterday);
        LocalDate pastDate = now.minusMonths(100);
        System.out.println("Past Date = " + pastDate);
        LocalDate pastMonth = now.minusMonths(1);
        System.out.println("Past Month = " + pastMonth);
        if (now.isAfter(yesterday))
        {
            System.out.println("Yes Boss");
        }
    }
}
