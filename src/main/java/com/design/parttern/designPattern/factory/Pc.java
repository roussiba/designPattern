package com.design.parttern.designPattern.factory;

public class Pc extends Computer{
    private final String ram;
    private final String hdd;
    private final String cpu;

    public Pc(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getHdd() {
        return this.hdd;
    }

    @Override
    public String getCpu() {
        return this.cpu;
    }
}
