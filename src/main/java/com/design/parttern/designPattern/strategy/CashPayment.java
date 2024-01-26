package com.design.parttern.designPattern.strategy;

public class CashPayment implements PayStrategy{
    @Override
    public void pay() {
        System.out.print("Paiement CASH effectue avec success");
    }
}
