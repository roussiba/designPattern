package com.design.parttern.designPattern.decorator;

public class Caramel extends BoissonDecorateur{
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 2.5 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + "en du caramel";
    }
}
