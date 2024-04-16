package org.example.date_time;

import java.time.Instant;

public class Test5_Instant {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);
        Instant now = Instant.now();
        System.out.println(now);
    }
}
