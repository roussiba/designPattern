package com.design.parttern.designPattern.decorator;

public class Cafe extends Boisson{

    public Cafe(){
        description = "Je suis un café";
    }
    @Override
    public double cout() {
        return 0;
    }
}
