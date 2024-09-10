package org.example.interview;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class P4_Frequency_List {
    public static void main(String[] args) {
        System.out.println("How do you find frequency of each element in an array or a list?");
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        Map<String, Long> collect = stationeryList.stream().collect((Collectors.groupingBy(Function.identity(), Collectors.counting())));
        System.out.println(collect);
    }
}
