package com.company;

import Bridge.ITV;
import Bridge.LogitechRemoteControl;
import Bridge.SonyTV;
import Decorator.Car;
import Decorator.Conditioner;
import Decorator.LeatherInterior;
import Decorator.SimpleCar;
import Facade.ShopKeeper;
import Flyweight.Coffee;
import Flyweight.CoffeeContext;
import Flyweight.CoffeeFactory;
import Proxy.OfficeInternetAccess;
import Proxy.ProxyInternetAccess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static Flyweight.Waitress.takeOrder;

public class Main {
    private static int  choice;
    private static Coffee[] coffees = new Coffee[20];
    //table array
    private static CoffeeContext[] tables = new CoffeeContext[20];
    private static int ordersCount = 0;
    private static CoffeeFactory coffeeFactory;

    public static void main(String[] args) throws NumberFormatException, IOException {
    // Facade
//        do{
//            System.out.print("========= Mobile Shop ============ \n");
//            System.out.println("        1. IPHONE.");
//            System.out.println("        2. SAMSUNG.");
//            System.out.println("        3. BLACKBERRY.");
//            System.out.println("        4. Exit.");
//            System.out.println("Enter your choice: ");
//
//            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//            choice=Integer.parseInt(br.readLine());
//            ShopKeeper sk=new ShopKeeper();
//
//            switch (choice) {
//                case 1:
//                {
//                    sk.iphoneSale();
//                }
//                break;
//                case 2:
//                {
//                    sk.samsungSale();
//                }
//                break;
//                case 3:
//                {
//                    sk.blackberrySale();
//                }
//                break;
//                default:
//                {
//                    System.out.println("Nothing You purchased");
//                }
//                return;
//            }
//        }while(choice!=4);


    //Flyweight
//         coffeeFactory  = new CoffeeFactory();
//
//        takeOrder("Cappuccino", 2);
//        takeOrder("Cappuccino", 2);
//        takeOrder("Regular Coffee", 1);
//        takeOrder("Regular Coffee", 2);
//        takeOrder("Regular Coffee", 3);
//        takeOrder("Regular Coffee", 4);
//        takeOrder("Cappuccino", 4);
//        takeOrder("Cappuccino", 5);
//        takeOrder("Regular Coffee", 3);
//        takeOrder("Cappuccino", 3);
//
//        for (int i = 0; i < ordersCount; ++i) {
//            coffees[i].serveCoffee(tables[i]);
//        }
//
//        System.out.println("\nTotal Coffee objects made: " +  coffeeFactory.getTotalCoffeeFlavorsMade());


    //Proxy
//        OfficeInternetAccess access = new ProxyInternetAccess("Mihailov Sergei");
//        access.grantInternetAccess();


    //Decorator
        Car car = new SimpleCar();
        System.out.println("Price: " + car.getPrice()
                + ", Description: " + car.getDescription());

        car = new Conditioner(car);
        System.out.println("Price: " + car.getPrice()
                + ", Description: " + car.getDescription());

        car = new LeatherInterior(car);
        System.out.println("Price: " + car.getPrice()
                + ", Description: " + car.getDescription());


    //Bridge
//        ITV tv = new SonyTV();
//        LogitechRemoteControl lrc = new LogitechRemoteControl(tv);
//        lrc.setChannelKeyboard(100);



    }



    public static void takeOrder(String flavorIn, int table) { //for Flyweight
        coffees[ordersCount] = coffeeFactory.getCoffeeFlavor(flavorIn);
        tables[ordersCount] = new CoffeeContext(table);
        ordersCount++;
    }
}
