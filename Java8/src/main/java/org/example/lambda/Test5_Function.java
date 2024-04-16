package org.example.lambda;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Function;
public class Test5_Function {
    public static void main(String[] args) {
        Function<String,Integer> function = x -> x.length();
        Function<String,String> function2 = s -> s.substring(0,3);
        Function<String,String> function3 = s -> s.toUpperCase();

        System.out.println(function3.andThen(function2).apply("Prasad"));

        Function<Integer,Integer> function1 = x -> x * 2;
        Function<Integer,Integer> function4 = x -> x * x * x;
        System.out.println(function1.andThen(function4).apply(3));
        System.out.println(function4.andThen(function1).apply(3));
        System.out.println(function1.compose(function4).apply(3));

        Function<Objects, Objects> identity = Function.identity();

        Function<String, String> identity1 = Function.identity();
        System.out.println(identity1.apply("Prasad"));
    }
}
