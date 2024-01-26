package com.design.parttern.designPattern.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        EagerInitilizationSingleton.getInstance();
        StaticBlockInitializationSingleton.getInstance();
        LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton.getInstance();

        for (int i = 0; i < 5; i++) {
            ThreadStafeSingleton.getDoubleCheckThreadSingleton();

            ThreadStafeSingleton.getInstance();
            ThreadStafeSingleton.getInstance();
            ThreadStafeSingleton.getInstance();

            ThreadStafeSingleton.getDoubleCheckThreadSingleton();
            ThreadStafeSingleton.getDoubleCheckThreadSingleton();
        }
    }
}
