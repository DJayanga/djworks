package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Cars car1 = new Cars();
        Cars car2 = new Cars();
        Cars car3 = new Cars();
        Cars car4 = new Cars();
        Cars car5 = new Cars();

        Bikes b1 = new Bikes();
        Bikes b2 = new Bikes();
        Bikes b3 = new Bikes();
        Bikes b4 = new Bikes();
        Bikes b5 = new Bikes();

        car1.name = "Lamborgini";
        car2.name = "Frerrri";
        car3.name = "Bugatti";
        car4.name = "Mazda";
        car1.name = "Corralla";

        car1.cost = "$20000";
        car2.cost = "$22000";
        car3.cost = "$16000";
        car4.cost = "$19000";
        car5.cost = "$12000";

        b1.name = "Pulser";
        b2.name = "Hornet";
        b3.name = "FZ";
        b4.name = "Jade";
        b5.name = "CBR";

        b1.cost = "$4000";
        b2.cost = "$8000";
        b3.cost = "$1700";
        b4.cost = "$6700";
        b5.cost = "$7000";

        Scanner s = new Scanner(System.in);
        System.out.println("What Do You Want to Buy?");
        System.out.println("Input 1 for Bikes");
        System.out.println("Input 2 for Cars");

        System.out.print("Please enter your choice here : ");
        int choice = s.nextInt();

        if (choice == 1) {
            System.out.print("We have 5 Bike models.");
            System.out.println("1. " + b1.name);
            System.out.println("2. " + b2.name);
            System.out.println("3. " + b3.name);
            System.out.println("4. " + b4.name);
            System.out.println("5. " + b5.name);

            System.out.println("Which Bike do you like : ");
            int n = s.nextInt();
            if (n==1){
                System.out.println("The Cost of "+ b1.name + " is "+b1.cost +".");
            }
            else if (n==2){
                System.out.println("The Cost of "+ b2.name + " is "+b2.cost +".");
            }
            else if (n==3){
                System.out.println("The Cost of "+ b3.name + " is "+b3.cost +".");
            }
            else if (n==4){
                System.out.println("The Cost of "+ b4.name + " is "+b4.cost +".");
            }
            else if (n==5){
                System.out.println("The Cost of "+ b5.name + " is "+b5.cost +".");
            }
            else{
                System.out.println("Please enter a valid number.");
            }
        }

        else if (choice == 2) {
            System.out.println("We have 5 Bike models.");
            System.out.println("1. " + car1.name);
            System.out.println("2. " + car2.name);
            System.out.println("3. " + car3.name);
            System.out.println("4. " + car4.name);
            System.out.println("5. " + car5.name);

            System.out.print("Which Bike do you like : ");
            int n = s.nextInt();
            if (n==1){
                System.out.println("The Cost of "+ car1.name + " is "+ car1.cost +".");
            }
            else if (n==2){
                System.out.println("The Cost of "+ car2.name + " is "+ car2.cost +".");
            }
            else if (n==3){
                System.out.println("The Cost of "+ car3.name + " is "+car3.cost +".");
            }
            else if (n==4){
                System.out.println("The Cost of "+ car4.name + " is "+car4.cost +".");
            }
            else if (n==5){
                System.out.println("The Cost of "+ car5.name + " is "+car5.cost +".");
            }
            else{
                System.out.println("Please enter a valid number.");
            }
        }
        else {
            System.out.println("Please enter a valid number.");
        }
    }
}
