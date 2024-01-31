package com.design.parttern.designPattern.adapter;

public class OnePlus implements AndroidPhone{
    @Override
    public void charge() {
        System.out.println("Android onePlus");
    }
}
