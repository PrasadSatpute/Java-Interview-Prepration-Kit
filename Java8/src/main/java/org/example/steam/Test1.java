package org.example.steam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","cherry");
        Stream<String> myStream = list.stream(); // we convert collection into Stream

        String[] array = {"apple","banana","cherry"};
        Stream<String> stream = Arrays.stream(array);      //ALT+ENTER

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);  //ALT+ENTER

        Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(100);

        Stream<Integer> limit1 = Stream.generate(() -> (int) (Math.random() * 100)).limit(5);

    }
}
