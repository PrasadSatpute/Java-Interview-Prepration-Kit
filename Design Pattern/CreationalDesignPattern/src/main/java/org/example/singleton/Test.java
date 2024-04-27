package org.example.singleton;

public class Test {
    public static void main(String[] args) {
        EagerSingleton obj1 = EagerSingleton.getInstance();
        EagerSingleton obj2 = EagerSingleton.getInstance();
        System.out.println("Eager Obj1 = "+obj1.hashCode());
        System.out.println("Eager Obj2 = "+obj2.hashCode());
        System.out.println("------------------------------------------------");
        LazySingleton lazyObj1 = LazySingleton.getInstance();
        LazySingleton lazyObj2 = LazySingleton.getInstance();
        System.out.println("Lazy Object 1 = "+lazyObj1.hashCode());
        System.out.println("Lazy Object 2 = "+lazyObj2.hashCode());
        System.out.println("------------------------------------------------");
        LazyDoubleCheckSingleton lazyDObj1 = LazyDoubleCheckSingleton.getInstance();
        LazyDoubleCheckSingleton lazyDObj2 = LazyDoubleCheckSingleton.getInstance();
        System.out.println("Lazy double Check Object 1 = "+lazyDObj1.hashCode());
        System.out.println("Lazy double Check Object 2 = "+lazyDObj2.hashCode());
        System.out.println("------------------------------------------------");
        LazyInnerSingleton lazyInnerObj1 = LazyInnerSingleton.getInstance();
        LazyInnerSingleton lazyInnerObj2 = LazyInnerSingleton.getInstance();
        System.out.println("Lazy Inner Object 1 = "+lazyInnerObj1.hashCode());
        System.out.println("Lazy Inner Object 2 = "+lazyInnerObj2.hashCode());
    }
}
