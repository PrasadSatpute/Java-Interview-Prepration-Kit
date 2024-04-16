package org.example.lambda;
public class Test2 implements Runnable{
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.run();
    }
    @Override
    public void run() {
        for (int i = 0; i <=10; i++) {
            System.out.println("Hello " + i);
        }
    }
}
