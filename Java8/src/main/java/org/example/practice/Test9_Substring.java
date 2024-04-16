package org.example.practice;
import java.util.function.Predicate;


//Write a method to check if a string contains a specific substring using Predicate interface.

public class Test9_Substring {
    public static void main(String[] args) {
        String s = "There is some Substring where we will find it Using Predicate";
        Predicate<String> substring = str -> str.toLowerCase().contains("substring");
        System.out.println(substring.test(s));
    }
}

