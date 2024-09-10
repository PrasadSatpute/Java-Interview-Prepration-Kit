package org.example.interview;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class P5_Reverse {
    public static void main(String[] args) {
        System.out.println("How do you sort the given list of decimals in reverse order?");
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
