package DefinitionMachine;

import java.util.Scanner;

public class CoffeeMachine {
    static Scanner sc = new Scanner(System.in);
    public static int InitialWater = 400;
    public static int InitialMilk = 540;
    public static int InitialBeans = 120;
    public static int disposable_cups = 9;
    public static int totalMoney = 550;

    public static void Remaining() {
        System.out.println("\nThe coffee machine has:");
        System.out.println(InitialWater + " of water");
        System.out.println(InitialMilk + " of milk");
        System.out.println(InitialBeans + " of coffee beans");
        System.out.println(disposable_cups + " of disposable cups");
        System.out.println("$" + totalMoney + " of money");
    }
}
