package org.example.singleton;

public class LazyInnerSingleton {
    private LazyInnerSingleton(){}
    private static class SingletonHelper
    {
        private static final LazyInnerSingleton instance = new LazyInnerSingleton();
    }

    public static LazyInnerSingleton getInstance()
    {
        return SingletonHelper.instance;
    }
}
