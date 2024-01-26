package com.design.parttern.designPattern.singleton;

public class LazyInitializationSingleton {
    public static LazyInitializationSingleton instance;

    private LazyInitializationSingleton(){

    }

    public static LazyInitializationSingleton getInstance(){
        if (instance == null){
            System.out.println("Creating new instance of the class");
            instance = new LazyInitializationSingleton();
        }
        System.out.println("Returning the instance of the class lazy");
        return instance;
    }
}
