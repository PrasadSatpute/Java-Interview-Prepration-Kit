package org.example.interview2;
import java.util.stream.Stream;
public class P25_Fibonacci {
    public static void main(String[] args) {
        Stream.iterate(new int[] {0, 1}, f -> new int[] {f[1], f[0]+f[1]})
                .limit(10)
                .map(f -> f[0])
                .forEach(i -> System.out.print(i+" "));
    }
}
