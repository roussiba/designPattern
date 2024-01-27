package com.design.parttern.designPattern.chainofreesponsibility;

public class Euro5Dispenser implements DispenseChain{

    private DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.amount() >= 5){
            int number = currency.amount() / 5;
            int remain = currency.amount() % 5;
            System.out.println("Dispensing " + number +" 5E");
            if(remain != 0) chain.dispense(new Currency(remain));
        }
        else{
            chain.dispense(currency);
        }
    }
}
