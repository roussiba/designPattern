package com.design.parttern.designPattern.decorator;

public abstract class BoissonDecorateur extends Boisson {

    protected Boisson boisson;
    public BoissonDecorateur(Boisson boisson){
        super();
        this.boisson = boisson;
    }
    public abstract String getDescription();
}
