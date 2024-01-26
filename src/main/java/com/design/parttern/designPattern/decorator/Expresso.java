package com.design.parttern.designPattern.decorator;

public class Expresso extends Boisson{

    public Expresso(){
        description = "Je suis un expresso";
    }
    @Override
    public double cout() {
        return 0;
    }
}
