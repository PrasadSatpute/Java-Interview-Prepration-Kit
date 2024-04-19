package org.example.interview2;
import java.util.Arrays;
import java.util.stream.IntStream;
public class P9_Merge_Arrays {
    public static void main(String[] args) {
        System.out.println("How do you merge two unsorted arrays into single sorted array using Java 8 streams?");
        System.out.println("With Duplicate");
        int[] a = new int[] {4,4,6,8,9,3, 2, 7, 1,5};
        int[] b = new int[] {8,9,6,2,1,9, 3, 9, 1,5};

        IntStream
                .concat(Arrays.stream(a).sorted(),Arrays.stream(b).sorted())
                .forEach(System.out::print);

        System.out.println("\nWithout Duplicate");

        IntStream
                .concat(Arrays.stream(a).sorted(),Arrays.stream(b).sorted())
                .distinct()
                .forEach(System.out::print);

    }
}
