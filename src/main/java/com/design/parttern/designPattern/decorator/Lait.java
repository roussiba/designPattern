package com.design.parttern.designPattern.decorator;

public class Lait extends BoissonDecorateur{
    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 3.3 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " en plus du lait";
    }
}
