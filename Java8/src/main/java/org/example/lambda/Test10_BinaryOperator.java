package org.example.lambda;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;
public class Test10_BinaryOperator {
    public static void main(String[] args) {
        BiFunction<String,String,String> biFunction = (str1,str2) -> str1 + str2;
        BinaryOperator<String> binaryOperator = (str1,str2) -> str1 + str2;
        System.out.println(binaryOperator.apply("Hi","Hello"));
    }
}
