package com.design.parttern.designPattern.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton(){
    }
    public static synchronized ThreadSafeSingleton getInstance(){
        if (instance == null){
            instance = new ThreadSafeSingleton();
            System.out.println("Thread safe new instance");
        }
        System.out.println("Thread safe return instance");
        return instance;
    }

    public static ThreadSafeSingleton getDoubleCheckThreadSingleton(){
        if (instance == null){
            synchronized(ThreadSafeSingleton.class){
                if (instance == null){
                    instance = new ThreadSafeSingleton();
                    System.out.println("Thread safe double check new instance");
                    return instance;
                }
            }
            return instance;
        }
        System.out.println("Thread safe double check return instance");
        return instance;
    }
}
