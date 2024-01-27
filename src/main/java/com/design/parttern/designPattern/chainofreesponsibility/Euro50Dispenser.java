package com.design.parttern.designPattern.chainofreesponsibility;

public class Euro50Dispenser implements DispenseChain{

    private DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.amount() >= 50){
            int number = currency.amount() / 50;
            int remain = currency.amount() % 50;
            System.out.println("Dispensing " + number +" 50E");
            if(remain != 0) chain.dispense(new Currency(remain));
        }else{
            chain.dispense(currency);
        }
    }
}
