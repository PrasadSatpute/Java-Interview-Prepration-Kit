package org.example.practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Array2ndMinMaxProduct {
    public static void main(String[] args) {
        List<Integer> listInteger = Arrays.asList(5,7,9,10,3,5,2,7,9,23,15,8,6);
        int productMinMax = listInteger.stream().sorted((x,y) -> y-x).skip(1).findFirst().get() + listInteger.stream().sorted().skip(1).findFirst().get();
        System.out.println(productMinMax);
    }
}
