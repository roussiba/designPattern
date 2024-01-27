package com.design.parttern.designPattern.chainofreesponsibility;

public class Euro10Dispenser implements DispenseChain{

    private DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.amount() >= 10){
            int number = currency.amount() / 10;
            int remain = currency.amount() % 10;
            System.out.println("Dispensing " + number +" 10E");
            if(remain != 0) chain.dispense(new Currency(remain));
        }
        else{
            chain.dispense(currency);
        }
    }
}
