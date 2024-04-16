package org.example.practice;
import java.util.Optional;
//Use the Optional class to handle a potentially null value
//and provide a default value if it's null.
public class Test7_Optional {
    public static void main(String[] args) {

        System.out.println(getOptional());
    }
    public static Optional<String> getOptional()
    {
        return Optional.ofNullable(null);
    }
}
