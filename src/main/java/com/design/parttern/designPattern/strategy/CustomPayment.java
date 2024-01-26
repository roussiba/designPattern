package com.design.parttern.designPattern.strategy;

public class CustomPayment implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("Paiement CUSTOM effectue avec success");
    }
}
