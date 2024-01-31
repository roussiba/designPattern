package com.design.parttern.designPattern.singleton;

public class EagerInitializationSingleton {

    private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();

    private EagerInitializationSingleton(){}

    public static EagerInitializationSingleton getInstance(){
        System.out.println("new instance Eager created");
        return instance;
    }
}
