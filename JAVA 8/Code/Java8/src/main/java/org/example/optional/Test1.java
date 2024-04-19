package org.example.optional;

import java.util.Optional;

public class Test1 {
    public static void main(String[] args) {
//        to handel NullPointerException
        Optional<String> name = getName("AC");
        if (name.isPresent())
        {
            System.out.println(name.get());
        }
//        In java 8 using
        name = getName("ABC");
        name.ifPresent(System.out::println);
    }
    private static Optional<String> getName(String string)
    {
        String name = string;
        if (name.equalsIgnoreCase("ABC"))
        {
            return Optional.ofNullable(name);
        }
        else {
            name = null;
        }
        return Optional.ofNullable(name);
    }
}
