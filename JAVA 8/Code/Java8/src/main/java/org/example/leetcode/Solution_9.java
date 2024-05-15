package org.example.leetcode;

class Solution {
    public boolean isPalindrome(int x) {
        String original = Integer.toString(x);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }
}
public class Solution_9 {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.isPalindrome(121));
    }
}
