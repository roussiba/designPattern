package com.design.parttern.designPattern.singleton;

public class EagerInitilizationSingleton {

    private static final  EagerInitilizationSingleton instance = new EagerInitilizationSingleton();

    private EagerInitilizationSingleton(){

    }

    public static EagerInitilizationSingleton getInstance(){
        System.out.println("new instance Eager created");
        return instance;
    }
}
