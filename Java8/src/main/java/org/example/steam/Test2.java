package org.example.steam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6514,514,651465,65,465,6,15,11,694,1,54,64);
        List<Integer> filterdList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(filterdList);
        List<Integer> mappedList = filterdList.stream().map(x -> x / 2).collect(Collectors.toList());
        System.out.println(mappedList);

        System.out.println("-----------------------------------------------------");

        List<Integer> list1 = Arrays.asList(6514,514,651465,65,465,6,15,11,694,1,54,64);
        List<Integer> filterdMappedList1 = list1.stream().filter(x -> x % 2 == 0).map(x -> x / 2).collect(Collectors.toList());
        System.out.println(filterdMappedList1);

        System.out.println("-----------------------------------------------------");

        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,43,9,0,5,44,23,43,0,1,2);
        List<Integer> filterdMappedList2 = list2.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x / 2)
                .distinct().sorted((a, b) -> (b - a))
                .collect(Collectors.toList());
        System.out.println(filterdMappedList2);

        System.out.println("-----------------------------------------------------");

        List<Integer> list3 = Arrays.asList(1,2,3,4,5,6,7,43,9,0,5,44,23,43,0,1,2);
        List<Integer> filterdMappedList3 = list3.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x / 2)
                .distinct().sorted((a, b) -> (b - a))
                .limit(4)
                .skip(1)
                .collect(Collectors.toList());
        System.out.println(filterdMappedList3);
    }
}
