package com.design.parttern.designPattern.proxy;

public class CommandExcecuteImpl implements CommandExcecutor{

    @Override
    public void excecuteCommand(String cmd) {
        System.out.println("Command "+ cmd + "dbd");
    }
}
