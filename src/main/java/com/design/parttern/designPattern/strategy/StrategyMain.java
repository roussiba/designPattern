package com.design.parttern.designPattern.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(new PayPalPayment());
        paymentContext.executePayment();

        paymentContext.setStrategy(new CashPayment());
        paymentContext.executePayment();

        paymentContext.setStrategy(new CreditCardPayment());
        paymentContext.executePayment();
    }
}
