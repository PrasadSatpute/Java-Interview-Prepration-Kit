package org.example.practice3;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class String_Test {
    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";
        String s3 = "welcome to this coding practice interview preparation";

//        String into Array
        String[] arrayString1 = s1.split("");
        String[] arrayString2 = s1.split("");

//        Array into ArrayList
        List<String> arrayList1 = Arrays.asList(arrayString1);
        System.out.println(arrayList1);

        List<String> arrayList2 = Arrays.asList(arrayString2);
        System.out.println(arrayList2);

//        anagrams or not?
        List<String> sorted1 = Arrays.stream(s1.split("")).sorted().collect(Collectors.toList());
        List<String> sorted2 = Arrays.stream(s2.split("")).sorted().collect(Collectors.toList());
        System.out.println(sorted1.equals(sorted2)? "Anagram" : "Not");

//        Palindrome
        String s = "ABCBA";
        String revers = new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(revers) ? "Palindrome" : "Not");

//        frequency and count
        String frequent = "ABCDABDEFGABHGDFE";
        Map<Character,Long> freqList = frequent.chars().mapToObj(ch -> (char)ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(freqList);

//        Convert String First Character to upper case.
        String strChar[] = s3.split(" ");
        String upperStringChar = Arrays.stream(strChar).map(word -> word.substring(0, 1).toUpperCase() + word.substring(1)).collect(Collectors.joining(" "));
        System.out.println(upperStringChar);
    }
}
