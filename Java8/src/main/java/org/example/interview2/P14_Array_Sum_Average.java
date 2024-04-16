package org.example.interview2;
import java.util.Arrays;
import java.util.stream.IntStream;
public class P14_Array_Sum_Average {
    public static void main(String[] args) {
        System.out.println(" Given an integer array, find sum and average of all elements?");
        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        System.out.println("Sum of All = " + IntStream.of(a).sum());
        System.out.println("Arrays sum = " + Arrays.stream(a).sum());
        System.out.println("-----------------------------------------");
        System.out.println("Average = " + Arrays.stream(a).average().getAsDouble());
    }
}
