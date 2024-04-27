package org.example.singleton;

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    public EagerSingleton()
    {
        System.out.println("EagerSingleton Constructor Call");
    }

    public static EagerSingleton getInstance()
    {
        return instance;
    }
}
