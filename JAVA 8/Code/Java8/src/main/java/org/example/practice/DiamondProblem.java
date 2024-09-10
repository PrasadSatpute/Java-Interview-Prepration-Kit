package org.example.practice;

interface MyInterface1
{
    default int myDiamond()
    {
        return 0;
    }

}
interface MyInterface2
{
    default int myDiamond()
    {
        return 1;
    }

}
public class DiamondProblem implements MyInterface1,MyInterface2{
    public static void main(String[] args) {

    }
    @Override
    public int myDiamond() {
        return MyInterface1.super.myDiamond();
        // Call super method or Write your own Implementation Code
    }
}
