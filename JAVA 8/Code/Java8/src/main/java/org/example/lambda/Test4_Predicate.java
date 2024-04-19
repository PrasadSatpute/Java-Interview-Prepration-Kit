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

        Predicate<String> startsWithLetterV = x -> x.toLowerCase().charAt(0) == 'V' ;
        Predicate<String> endsWithLetterL = x -> x.toLowerCase().charAt(x.length() - 1) == 'l';
        Predicate<String> and = startsWithLetterV. and (endsWithLetterL);
        Predicate<String> or = startsWithLetterV. or (endsWithLetterL);
        Predicate<String> neget = startsWithLetterV;
        System.out.println( and.test("Vipul"));
        System.out.println( or.test("Vipul"));
        System.out.println( neget.test("Vipul"));
    }
}
