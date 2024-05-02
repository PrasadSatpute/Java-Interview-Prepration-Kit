package org.example.singleton;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton()
    {

    }

    public static synchronized LazySingleton getInstance()
    {
        if (instance == null)
        {
            return instance = new LazySingleton();
        }else {
            return instance;
        }
    }

}
