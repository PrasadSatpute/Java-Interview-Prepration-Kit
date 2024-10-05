package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class computer
{
    int cpu;
    int memory;

    public computer(int cpu, int memory) {
        this.cpu = cpu;
        this.memory = memory;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "computer{" +
                "cpu=" + cpu +
                ", memory=" + memory +
                '}';
    }
}

class computerTask implements Runnable{

    private List<computer> cList;

    public computerTask(List<computer> cList) {
        this.cList = cList;
    }

    @Override
    public void run() {
        cList.sort(Comparator.comparing(computer::getCpu).thenComparing(computer::getMemory));
        cList.forEach(System.out::println);
        System.out.println("Sorting :" + Thread.currentThread().getName());
    }
}


public class Test {
    public static void main(String[] args) {

        List<computer> computerList = new ArrayList<>();
        computerList.add(new computer(6,225));
        computerList.add(new computer(3,2365));
        computerList.add(new computer(4,2542));
        computerList.add(new computer(6,265));
        computerList.add(new computer(8,285));
        computerList.add(new computer(9,2315));


//        Thread t1 = new Thread(new computerTask(computerList));
//
//        t1.start();

//        computerList.forEach(System.out::println);


        connectionDb db1 = connectionDb.getInstance();

        db1.exicuteQuey("Select * from MainTable");

        connectionDb db2 = connectionDb.getInstance();

        db2.exicuteQuey("Select * from otherTable");

        System.out.println("db1 : " + db1.hashCode());
        System.out.println("db1 : " + db1.hashCode());

    }

}
