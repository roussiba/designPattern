package com.design.parttern.designPattern.singleton;

public class ThreadStafeSingleton {
    private static ThreadStafeSingleton instance;
    private ThreadStafeSingleton(){
    }
    public static synchronized ThreadStafeSingleton getInstance(){
        if (instance == null){
            instance = new ThreadStafeSingleton();
            System.out.println("Thread safe new instance");
            return instance;
        }
        System.out.println("Thread safe return instance");
        return instance;
    }

    public static ThreadStafeSingleton getDoubleCheckThreadSingleton(){
        if (instance == null){
            synchronized(ThreadStafeSingleton.class){
                if (instance == null){
                    instance = new ThreadStafeSingleton();
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
