package com.design.parttern.designPattern.strategy;

public class PaymentContext {

    private PayStrategy payStrategy;

    public PaymentContext(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    void executePayment(){
        if(payStrategy == null){
            System.err.println("Aucun moyen de paiement n'a ete defini");
            return;
        }
        payStrategy.pay();
    }

    void setStrategy(PayStrategy payStrategy){
       this.payStrategy = payStrategy;
    }
}
