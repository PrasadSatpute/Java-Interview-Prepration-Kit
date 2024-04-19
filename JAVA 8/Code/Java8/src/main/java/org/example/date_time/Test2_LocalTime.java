package org.example.date_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Test2_LocalTime {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("Now = " + now);
        LocalTime customeTime = LocalTime.of(14,30);
        System.out.println("Custome Time = " + customeTime);
        LocalTime timeIntTime = LocalTime.parse("15:30:45");
        System.out.println(timeIntTime);
        LocalTime beforHour = now.minusHours(1);
        System.out.println("Last Hour = " + beforHour);
    }
}
