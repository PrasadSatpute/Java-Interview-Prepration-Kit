package org.example.interview;
import java.util.Arrays;

public class P9_Alphanumeric_Char_Array_String {
    public static void main(String[] args) {
        String str = "a1b2c3d4e5f6g7h8i9j0";
        char[] arr = str.toCharArray();
        System.out.println("Original array: " + Arrays.toString(arr));
        int[] nums = new String(arr)
                .chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .toArray();
        System.out.println("Numbers only: " + Arrays.toString(nums));
        System.out.println("-------------------------------------------------------------");
        
    }
}
