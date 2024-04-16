package org.example.interview;
import java.util.Arrays;
public class P5_Average_Even_Odd_Prime {
    public static void main(String[] args) {
        System.out.println("Find an average of even numbers using Java using Java 8 stream API.");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("---------------------------EVEN----------------------------");
        Arrays
                .stream(numbers)
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
        System.out.println("-----------------------------ODD--------------------------");
        Arrays
                .stream(numbers)
                .filter(x -> x % 2 != 0)
                .forEach(System.out::println);
        System.out.println("---------------------------PRIME----------------------------");
        Arrays
                .stream(numbers)
                .filter(P5_Average_Even_Odd_Prime::isPrime)
                .forEach(System.out::println);
        System.out.println("---------------------------AVERAGE----------------------------");
        double average = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .mapToDouble(n -> n)
                .average()
                .orElse(0.0);
        System.out.println("The average of even numbers is " + average);
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
