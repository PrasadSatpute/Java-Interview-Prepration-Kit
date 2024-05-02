package org.example.singleton.prevent;

import org.example.singleton.EagerSingleton;
import org.example.singleton.LazyDoubleCheckSingleton;
import org.example.singleton.LazyInnerSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, InvocationTargetException, InstantiationException, IllegalAccessException {
        LazySingleton lazyObj1 = LazySingleton.getInstance();
//        LazySingleton lazyObj2 = (LazySingleton) lazyObj1.clone();
        System.out.println("Lazy Object 1 = "+lazyObj1.hashCode());
//        System.out.println("Lazy Object 2 = "+lazyObj2.hashCode());
        System.out.println("------------------------------------------------");
        LazySingleton reflectionInstance = null;

        Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
        for (Constructor constructor : constructors)
        {
            constructor.setAccessible(true);
            reflectionInstance = (LazySingleton) constructor.newInstance();
        }

        System.out.println("Reflection Instance = "+reflectionInstance.hashCode());
    }
}
