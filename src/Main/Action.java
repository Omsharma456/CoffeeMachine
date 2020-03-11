package Main;

import DefinitionMachine.CoffeeMachine;

import java.util.Scanner;

public class Action extends CoffeeMachine {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
            String choose = sc.next();
            switch (choose) {
                case "remaining":
                    Remaining();
                    break;

                case "buy":
                    Buy();
                    break;
            }
        }
    }
}
