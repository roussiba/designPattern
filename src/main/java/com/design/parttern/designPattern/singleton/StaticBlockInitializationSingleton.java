package com.design.parttern.designPattern.singleton;

public class StaticBlockInitializationSingleton {
    private static StaticBlockInitializationSingleton instance;

    private StaticBlockInitializationSingleton(){

    }

    static {
        try {
            instance = new StaticBlockInitializationSingleton();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static StaticBlockInitializationSingleton getInstance(){
        System.out.println("new instance static block created");
        return instance;
    }

}
