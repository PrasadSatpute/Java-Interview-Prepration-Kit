package org.example.interview;
import java.util.Arrays;
import java.util.stream.IntStream;
public class P16_Revers_Array {
    public static void main(String[] args) {
        System.out.println("Reverse an integer array");
        int[] array = new int[] {5, 1, 7, 3, 9, 6};

        int[] array1 = Arrays.stream(array).map(i -> array[array.length - 1]).toArray();
        System.out.println(Arrays.toString(array1));

        int[] array2 = IntStream.rangeClosed(1, array.length).map(i -> array[array.length - 1]).toArray();
        System.out.println(Arrays.toString(array2));

        int[] array3 = IntStream.rangeClosed(1, array.length).map(i -> array[array.length - i]).toArray();
        System.out.println(Arrays.toString(array3));

    }
}
