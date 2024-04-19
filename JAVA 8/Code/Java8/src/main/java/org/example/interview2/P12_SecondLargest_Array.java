package org.example.interview2;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class P12_SecondLargest_Array {
    public static void main(String[] args) {
        System.out.println("Find second largest number in an integer array?");
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        Integer secondLargestNumber = listOfIntegers
                .stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(secondLargestNumber);

        System.out.println(
                listOfIntegers
                        .stream()
                        .sorted((a,b) -> b-a)
                        .skip(1)
                        .findFirst()
                        .get());


    }
}
