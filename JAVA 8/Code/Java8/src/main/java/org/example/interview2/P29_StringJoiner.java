package org.example.interview2;

import java.util.StringJoiner;

public class P29_StringJoiner {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(",");

        System.out.println(stringJoiner.length());

        stringJoiner.setEmptyValue("Empty");

        System.out.println(stringJoiner.length() + " " + stringJoiner);

        stringJoiner.add("a");
        stringJoiner.add("b");
        stringJoiner.add("c");
        stringJoiner.add("d");
        System.out.println(stringJoiner);
    }
}
