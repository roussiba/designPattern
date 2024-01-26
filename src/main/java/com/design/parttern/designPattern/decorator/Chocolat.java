package com.design.parttern.designPattern.decorator;

public class Chocolat extends BoissonDecorateur{
    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 5 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + "en plus du chocolat";
    }
}
