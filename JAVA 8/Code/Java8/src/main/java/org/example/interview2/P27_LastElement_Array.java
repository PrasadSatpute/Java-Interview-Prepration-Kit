package org.example.interview2;
import java.util.Arrays;
import java.util.List;
public class P27_LastElement_Array {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");

        String lastElement =
                listOfStrings
                        .stream()
                        .skip(listOfStrings.size() - 1)
                        .findFirst()
                        .get();

        System.out.println(lastElement);
    }
}
