package com.design.parttern.designPattern.decorator;

public abstract class Boisson {
    public String description;

    public abstract double cout();

    public String getDescription() {
        return description;
    }
}
