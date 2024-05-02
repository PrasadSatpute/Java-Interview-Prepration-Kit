package org.example.builder;

public class Test {
    public static void main(String[] args) {
        User abc = new User.UserBuilder().setUserId("1").setUserName("ABC").setUserEmail("abc@gmail.com").build();
        System.out.println(abc);
    }
}
