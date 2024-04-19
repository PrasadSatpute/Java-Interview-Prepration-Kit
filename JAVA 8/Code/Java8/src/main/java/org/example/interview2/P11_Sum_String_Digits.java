package org.example.interview2;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class P11_Sum_String_Digits {
    public static void main(String[] args) {
        System.out.println("Find sum of all digits of a number in Java 8?");
        int i = 15623;

        Stream<Integer> integerStream = Stream.of(i);
        Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).forEach(System.out::println);
        int sum = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();
        System.out.println("Sum of All int = " + sum);
        System.out.println("--------------------------------------------------------------");

        // Convert n1 to Integer
        String n1 = "2798265";
        int convertedN1 = Integer.parseInt(n1);
        System.out.println("Converted n1 to Integer: " + convertedN1);

        // Separate integer and string from n2
        String n2 = "2a7f9f8e2a65";
        int intValueFromN2 = n2.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .reduce(0, (a, b) -> a * 10 + b);
        String stringValueFromN2 = n2.chars()
                .filter(Character::isAlphabetic)
                .mapToObj(ch -> (char) ch)
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println("Integer from n2: " + intValueFromN2);
        System.out.println("String from n2: " + stringValueFromN2);

        // Convert n3 to String
        int n3 = 2798265;
        String convertedN3 = String.valueOf(n3);
        System.out.println("Converted n3 to String: " + convertedN3);

    }
}
