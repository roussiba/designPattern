package com.design.parttern.designPattern.decorator;

import java.util.Arrays;

public class DecoratorMain {
    public static void main(String[] args) {

        Boisson expresso = new Expresso();
        System.out.println("Description = " + expresso.getDescription() + " | Prix : "+ expresso.cout());

        Boisson lait = new Lait(expresso);
        System.out.println("Description = " + lait.getDescription() + " | Prix : "+ lait.cout());

    }
}
