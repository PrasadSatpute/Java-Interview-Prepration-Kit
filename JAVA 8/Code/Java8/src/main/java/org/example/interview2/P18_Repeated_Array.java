package org.example.interview2;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class P18_Repeated_Array {
    public static void main(String[] args) {
        System.out.println("How do you find the most repeated element in an array?");
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

        Map<String, Long> elementCountMap =
                listOfStrings
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map.Entry<String, Long> mostFrequentElement =
                elementCountMap
                        .entrySet()
                        .stream()
                        .max(Map.Entry.comparingByValue())
                        .get();

        System.out.println("Most Frequent Element : "+mostFrequentElement.getKey());

        System.out.println("Count : "+mostFrequentElement.getValue());
    }
}
