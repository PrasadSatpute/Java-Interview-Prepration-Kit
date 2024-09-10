package org.example.interview;
import java.util.stream.IntStream;

public class P19_Palindrom {
    public static void main(String[] args) {
        System.out.println("Palindrome program using Java 8 streams");

        String str = "ROTATOR";

        boolean isItPalindrome = IntStream.range(0, str.length()/2).
                noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i -1));

        if (isItPalindrome)
        {
            System.out.println(str+" is a palindrome");
        }
        else
        {
            System.out.println(str+" is not a palindrome");
        }

        // Reverse the string using Java 8
        String reversedString = new StringBuilder(str).reverse().toString();

        if(reversedString.equals(str))
        {
            System.out.println(str+" is a palindrome");
        }
        else
        {
            System.out.println(str+" is not a palindrome");
        }

        // Reverse the string using Java 8
        String reversedString2 =
                IntStream
                        .range(0, str.length())
                        .mapToObj(i -> str.charAt(str.length() - 1 - i))
                        .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                        .toString();

        if(reversedString2.equals(str))
        {
            System.out.println(str+" is a palindrome");
        }
        else
        {
            System.out.println(str+" is not a palindrome");
        }
    }
}
