package org.example.interview;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class P6_Join_Prefix_Suffix {
    public static void main(String[] args) {
        System.out.println("Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?");
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        System.out.println(listOfStrings);
        String joinedString = listOfStrings.stream().collect(Collectors.joining(", ", "[", "]"));
        System.out.println(joinedString);
    }
}
