package com.design.parttern.designPattern.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        EagerInitializationSingleton.getInstance();
        StaticBlockInitializationSingleton.getInstance();
        LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton.getInstance();

        for (int i = 0; i < 5; i++) {
            ThreadSafeSingleton.getDoubleCheckThreadSingleton();

            ThreadSafeSingleton.getInstance();
            ThreadSafeSingleton.getInstance();
            ThreadSafeSingleton.getInstance();

            ThreadSafeSingleton.getDoubleCheckThreadSingleton();
            ThreadSafeSingleton.getDoubleCheckThreadSingleton();
        }
    }
}
