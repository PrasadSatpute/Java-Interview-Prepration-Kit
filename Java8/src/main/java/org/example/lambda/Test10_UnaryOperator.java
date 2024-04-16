package org.example.lambda;
import java.util.function.Function;
import java.util.function.UnaryOperator;
public class Test10_UnaryOperator {
    public static void main(String[] args) {
        Function<Integer,Integer> function1 = x -> x * x;
        Function<String,String> function3 = str -> str.toLowerCase();
        UnaryOperator<Integer> unaryOperator = x -> x * x;
        UnaryOperator<String> unaryOperator1 = str -> str.toLowerCase();
    }
}
