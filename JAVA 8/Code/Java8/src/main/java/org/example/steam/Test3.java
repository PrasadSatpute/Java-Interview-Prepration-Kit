package org.example.steam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        List<Integer> list3 = Arrays.asList(1,2,3,4,5,6,7,43,9,0,5,44,23,43,0,1,2);

        List<Integer> collect = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .filter(x -> x % 2 == 0)
                .map(x -> x /10)
                .distinct()
                .sorted()
                .peek(System.out::println)      //   we will write this anywhere
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
