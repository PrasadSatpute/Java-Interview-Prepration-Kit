package org.example.lambda;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class Test6_Consumer {
    public static void main(String[] args) {
        Consumer<String> stringConsumer = System.out::println;
        stringConsumer.accept("Prasad");
        Consumer<List<Integer>> listConsumer = li -> {
            for (Integer i : li) {
                System.out.println(i + 100);
            }
        };
        listConsumer.accept(Arrays.asList(1, 2, 3, 4));
        Consumer<List<Integer>> listConsumer1 = li -> {
            for (Integer i : li) {
                System.out.println(i);
            }
        };
        listConsumer1.accept(Arrays.asList(1, 2, 3, 4));

        listConsumer.andThen(listConsumer1).accept(Arrays.asList(1,2,3,4));

        Consumer<Integer> squareMe = i -> System.out.println("Square is = "+i * i);
        squareMe.accept(5);
        Consumer<Integer> doubleMe = i -> System.out.println("Double is = "+(i + i));
        doubleMe.accept(5);
        squareMe.andThen(doubleMe).accept(5);
    }
}
