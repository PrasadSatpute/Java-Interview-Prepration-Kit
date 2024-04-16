package org.example.steam;

import java.util.stream.Stream;

public class Test5 {
    public static void main(String[] args) {
        Long l = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .filter(x -> x % 2 == 0)
                .map(x -> x / 20)
                .distinct()
                .count();
        System.out.println(l);
    }
}
