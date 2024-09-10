package org.example.interview;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class P1_Odd_Even {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        Map<Boolean, List<Integer>> oddEvenNumbersMap =
                listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println("Even = " + oddEvenNumbersMap.get(true));
        System.out.println("Odd = " + oddEvenNumbersMap.get(false));

        List<Integer> Even = listOfIntegers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(Even);

        List<Integer> Odd= listOfIntegers.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
        System.out.println(Odd);
    }
}
