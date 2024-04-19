package org.example.lambda;
import java.util.function.*;
public class Test9_BiPredicate_BiFunction_BiConsumer {
    public static void main(String[] args) {

        BiPredicate<Integer, Integer> biPredicate = (x, y) -> x % 2 == 0 && y % 2 == 0;
        System.out.println(biPredicate.test( 2, 4));

        BiPredicate<String,Integer> biPredicate1 = (str,x) -> str.length() == x;
        System.out.println(biPredicate1.test("ABCDE",5));

        BiFunction<String,String,Integer> biFunction = (x,y) -> x.length() + y.length();
        System.out.println(biFunction.apply("Hi","Hello"));

        BiConsumer<Integer,Integer> biConsumer = (x,y) -> System.out.println(x + y);
        biConsumer.accept(1,2);
    }
}
