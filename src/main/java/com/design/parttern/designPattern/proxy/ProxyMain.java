package com.design.parttern.designPattern.proxy;

public class ProxyMain {
    public static void main(String[] args) {
        CommandExcecutor cmdLine = new CommandExcecutorProxy("bass", "passe");
        try {
            cmdLine.excecuteCommand("ls -a");
            cmdLine.excecuteCommand("rm some folder");
        } catch (Exception e) {
            System.out.print("error");;
        }
    }
}
