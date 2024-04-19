package org.example.codingpractice;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //Printing the arraylist object
        System.out.println(list.get(0));

        LinkedList<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        System.out.println(al.get(0));

        Vector<Integer> integers = new Vector<>();
        integers.add(10);
        integers.add(106);
        integers.add(56);
        integers.add(15);
        System.out.println(integers.get(0));

        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(8);
        stack.push(8);
        stack.push(58);
        stack.push(82);
        stack.stream().forEach(System.out::println);
        System.out.println(stack.get(0));

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(56);
        priorityQueue.add(7658);
        priorityQueue.add(786);
        priorityQueue.add(56);
        priorityQueue.stream().forEach(System.out::println);
        System.out.println(priorityQueue.poll());
    }
}
