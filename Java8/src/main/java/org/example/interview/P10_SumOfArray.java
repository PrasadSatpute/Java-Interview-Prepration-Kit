package org.example.interview;
import java.util.Arrays;
public class P10_SumOfArray {
    public static void main(String[] args) {
        System.out.println("Write a program to find the sum of the entire array result using Java 8 streams.");
        int[] arr = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(arr).sum();
        System.out.println("Sum of all Array Elements = " + sum);
    }
}
