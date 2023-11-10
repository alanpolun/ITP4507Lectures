package Exam2022.Q4;

import java.util.Scanner;

public class PetrolSystem {
    
    public static void main(String[] args) {
        Petrol petrol = new Petrol();
        int action, vol;
        while (true) {
            System.out.println("0=exit, 1=buy petrol, 2=sell petrol");
            System.out.print("Enter action: ");
            action = CallScanner.sc.nextInt();
            CallScanner.sc.nextLine();
            switch (action) {
                case 0:
                    System.out.println("-- Exit --");
                    System.exit(0);
                case 1: // Buy Petrol
                    System.out.print("Enter volume of Petrol:");
                    vol = sc.nextInt();
                    CallScanner.sc.nextLine();
                    System.out.print("Enter the cost of Petrol:");
                    double cost = sc.nextDouble();
                    CallScanner.sc.nextLine();
                    petrol.buy(vol, cost);
                    break;
                case 2: // Sell Petrol
                    System.out.print("Enter volume of Petrol:");
                    vol = CallScanner.sc.nextInt();
                    CallScanner.sc.nextLine();
                    petrol.sell(vol);
                    break;
                default:
                    System.out.println("Invalid Action");
            }
            System.out.println(petrol.toString());
        }
    }
}// PetrolSystem
