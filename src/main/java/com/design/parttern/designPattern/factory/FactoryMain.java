package com.design.parttern.designPattern.factory;

import java.util.Arrays;

public class FactoryMain {
    public static void main(String[] args) {
        Computer server = ComputerFactory.getComputer("server");
        System.out.println(server + " " +  289 % 20);
    }
}
