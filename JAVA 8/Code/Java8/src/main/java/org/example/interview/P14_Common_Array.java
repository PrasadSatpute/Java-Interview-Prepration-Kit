package org.example.interview;
import java.util.Arrays;
import java.util.List;
public class P14_Common_Array {
    public static void main(String[] args) {
        System.out.println("How do you find common elements between two arrays?");
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

        list1.stream().filter(x -> list2.contains(x)).forEach(System.out::println);
        list1.stream().filter(list2::contains).forEach(System.out::println);
    }
}
