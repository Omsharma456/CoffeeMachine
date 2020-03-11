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

    public static void Buy() {
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        String need = sc.next();
        switch (need) {
            case "1":
                if (InitialWater >= 250 && InitialBeans >= 16) {
                    System.out.println("I have enough resources, making you a coffee!");
                    InitialWater -= 250;
                    InitialBeans -= 16;
                    disposable_cups -= 1;
                    totalMoney += 4;
                } else {
                    System.out.println("Sorry, not enough water!");
                }
                break;

            case "2":
                if (InitialWater >= 350 && InitialMilk >= 75 && InitialBeans >= 20) {
                    System.out.println("I have enough resources, making you a coffee!");
                    InitialWater -= 350;
                    InitialMilk -= 75;
                    InitialBeans -= 20;
                    disposable_cups -= 1;
                    totalMoney += 7;
                } else {
                    System.out.println("Sorry, not enough water!");
                }
                break;

            case "3":
                if (InitialWater >= 200 && InitialMilk >= 100 && InitialBeans >= 12) {
                    System.out.println("I have enough resources, making you a coffee!");
                    InitialWater -= 200;
                    InitialMilk -= 100;
                    InitialBeans -= 12;
                    disposable_cups -= 1;
                    totalMoney += 6;
                } else {
                    System.out.println("Sorry, not enough water!");
                }
                break;
        }
    }

    public static void Fill() {
        System.out.println("\nWrite how many ml of water do you want to add:");
        InitialWater += sc.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        InitialMilk += sc.nextInt();
        System.out.println("Write how many ml of coffee beans do you want to add:");
        InitialBeans += sc.nextInt();
        System.out.println("Write how many disposable cup of coffee do you want to add:");
        disposable_cups += sc.nextInt();
    }

    public static void Take() {
        System.out.println("I gave you $" + totalMoney);
        totalMoney -= totalMoney;
    }
}
