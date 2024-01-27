package com.design.parttern.designPattern.chainofreesponsibility;

public class Euro20Dispenser implements DispenseChain{

    private DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.amount() >= 20){
            int number = currency.amount() / 20;
            int remain = currency.amount() % 20;
            System.out.println("Dispensing " + number +" 20E");
            if(remain != 0) chain.dispense(new Currency(remain));
        }
        else{
            chain.dispense(currency);
        }
    }
}
