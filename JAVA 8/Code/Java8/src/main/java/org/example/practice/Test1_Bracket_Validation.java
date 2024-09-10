package org.example.practice;

import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Test1_Bracket_Validation {

    public static boolean checkValidation(String s)
    {
        List<Character> collect = s.chars().mapToObj(ch -> (char) ch).sorted().collect(Collectors.toList());
        collect.stream().forEach(System.out::println);
        Stack<Character> stackList= new Stack<>();
        System.out.println("Stack is Empty = "+stackList.isEmpty());
        for (int i = 0; i < collect.size(); i++) {
            stackList.push(collect.get(i));
            System.out.println("Push = "+collect.get(i));
        }
        System.out.println("Stack is Empty = "+stackList.isEmpty());

        boolean result = false;

        while (!stackList.isEmpty())
        {
            if (stackList.peek() == '}')
            {
                stackList.pop();
                if (stackList.peek() == '{')
                {
                    result = true;
                    stackList.pop();
                }
                else {
                    break;
                }
            }
            else if (stackList.peek() == ']')
            {
                stackList.pop();
                if (stackList.peek() == '[')
                {
                    result = true;
                    stackList.pop();
                }
                else {
                    break;
                }
            }
            else if (stackList.peek() == ')')
            {
                stackList.pop();
                if (stackList.peek() == '(')
                {
                    result = true;
                    stackList.pop();
                }
                else {
                    break;
                }
            }
            else {
                return false;
            }
        }
        System.out.println("Stack is Empty = "+stackList.isEmpty());

        return result;

//        List<String> listStr= new Integer_ArrayList<>();
//        for (int i = 0; i < s.length(); i++) {
//            listStr.add(String.valueOf(s.charAt(i)));
//        }
//
//        listStr.stream().sorted().distinct().forEach(System.out::println);
    }

    public static void main(String[] args) {
        String s1 = "[(){}]";
        String s2 = "[(]{})";
        System.out.println(Test1_Bracket_Validation.checkValidation(s2));
    }
}
