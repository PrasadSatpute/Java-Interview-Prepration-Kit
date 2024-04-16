package org.example.interview2;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class P10_Anagrams {
    public static void main(String[] args) {
        System.out.println("Java 8 program to check if two strings are anagrams or not?");
        String s1 = "RaceCar";
        String s2 = "CarRace";

        // Convert the String to a Stream<Character>
        Stream<Character> characterStream1 = s1.chars() // IntStream
                .mapToObj(ch -> (char) ch); // Convert int to char
        Stream<Character> characterStream2 = s2.chars() // IntStream
                .mapToObj(ch -> (char) ch); // Convert int to char

        BiPredicate<String,String> predicate = (a,b) -> {
            return (Stream.of(a.split(""))
                    .map(str -> str.toUpperCase())
                    .sorted()
                    .collect(Collectors.toList())
                            .equals(Stream.of(b.split(""))
                                    .map(str -> str.toUpperCase())
                                    .sorted()
                                    .collect(Collectors.toList())));

        };
        System.out.println(predicate.test(s1,s2));

    }
}
