package org.example.date_time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test4_ZonedDateTime {
    public static void main(String[] args) {
        ZonedDateTime current = ZonedDateTime.now();
        System.out.println("Now = " + current);
        ZonedDateTime timeIndia = ZonedDateTime.now();
        System.out.println("India = " + timeIndia);
        ZonedDateTime timeNewYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("New York = " + timeNewYork);
    }
}
