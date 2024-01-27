package com.design.parttern.designPattern.factory;

public abstract class Computer {
    public abstract String getRam();
    public abstract String getHdd();
    public abstract String getCpu();

    @Override
    public String toString() {
        return getRam()+" "+getHdd()+" "+getCpu();
    }
}
