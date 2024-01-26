package com.design.parttern.designPattern.strategy;

public class CreditCardPayment implements PayStrategy{
    @Override
    public void pay() {
        System.out.print("Paiement CREDIT-CARD effectue avec success");
    }
}
