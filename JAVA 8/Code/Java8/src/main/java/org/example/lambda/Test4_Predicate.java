package org.example.lambda;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class Test4_Predicate {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x > 100000;
        System.out.println(predicate.test(10000000));
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        list.stream().filter(n -> n % 2 == 0).mapToInt(n -> n).sum();

        Predicate<Integer> isEven = x -> x % 2 == 0;

        Predicate<String> startsWithLetterV = x -> x.toLowerCase().charAt(0) == 'v' ;
        Predicate<String> endsWithLetterL = x -> x.toLowerCase().charAt(x.length() - 1) == 'l';
        System.out.println( startsWithLetterV. and (endsWithLetterL).test("Vipul"));
        System.out.println( startsWithLetterV. or (endsWithLetterL).test("Vipul"));
        System.out.println( startsWithLetterV.negate().test("Vipul"));
    }
}
