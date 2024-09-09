package org.example.top10;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello World!";
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println(reversed);
    }
}
