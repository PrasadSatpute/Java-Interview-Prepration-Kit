package org.example.top10;

public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = new StringBuilder(input).reverse().toString().equals(input);
        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }
}
