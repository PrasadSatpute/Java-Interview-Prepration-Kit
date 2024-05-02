package org.example.singleton.prevent;

public class LazySingleton extends MyClone{
    private static LazySingleton instance;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Do not Clone this singleton class");
    }

    private LazySingleton()
    {
        if (instance != null)
        {
            throw new IllegalStateException("object Can't be create using Reflection");
        }
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
