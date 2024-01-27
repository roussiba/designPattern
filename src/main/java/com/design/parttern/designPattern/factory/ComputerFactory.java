package com.design.parttern.designPattern.factory;

public class ComputerFactory {

    public static Computer getComputer(String type){
        return switch (type) {
            case "pc" -> new Pc("8Go", "1To SATA", "2.3 Ghz");
            case "gamer" -> new PCGame("9Go", "2To SATA", "2.3 Ghz");
            case "server" -> new Server("10Go", "4To SATA", "2.3 Ghz");
            default -> null;
        };
    }
}
