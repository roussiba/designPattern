package com.design.parttern.designPattern.strategy;

public class PayPalPayment implements PayStrategy {
    @Override
    public void pay() {
        System.out.print("Paiement PayPal effectue avec success");
    }
}
