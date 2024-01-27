package com.design.parttern.designPattern.chainofreesponsibility;

import java.util.Arrays;
import java.util.Scanner;

public class ATMDispenseChain {

    Euro50Dispenser euro50Dispenser;

    public ATMDispenseChain(){
        euro50Dispenser = new Euro50Dispenser();
        Euro20Dispenser euro20Dispenser = new Euro20Dispenser();
        Euro10Dispenser euro10Dispenser = new Euro10Dispenser();
        Euro5Dispenser euro5Dispenser = new Euro5Dispenser();

        euro50Dispenser.setNextChain(euro20Dispenser);
        euro20Dispenser.setNextChain(euro10Dispenser);
        euro10Dispenser.setNextChain(euro5Dispenser);

    }

    public static void main(String[] args) {
        ATMDispenseChain dispenseChain = new ATMDispenseChain();

        while (true){
            int amount = 0;
            System.out.println("Enter Amount to dispense");
            Scanner scanner = new Scanner(System.in);

            amount = scanner.nextInt();
            if(amount % 5 != 0){
                System.out.println("The amount should be a multiple of 5");
                return;
            }
            dispenseChain.euro50Dispenser.dispense(new Currency(amount));

        }
    }
}
