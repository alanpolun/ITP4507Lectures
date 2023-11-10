package Exam2022.Q2;

public class DessertOrder {
    public static void checkOut(Dessert dess) {
        if (dess.getType() == 0)
            System.out.println("Price of " + dess.getName() + " ice-cream: $" + dess.getPrice());
        else if (dess.getType() == 1)
            System.out.println("Price of " + dess.getName() + " cheese cake: $" + dess.getPrice());
    }
} // class DessertOrder