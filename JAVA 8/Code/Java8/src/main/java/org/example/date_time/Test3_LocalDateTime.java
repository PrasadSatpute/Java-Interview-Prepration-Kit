package org.example.date_time;

import java.time.LocalDateTime;

public class Test3_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Now = " + now);
        LocalDateTime myDate = LocalDateTime.parse("2024-01-01T13:48");
        System.out.println(myDate);
    }
}
