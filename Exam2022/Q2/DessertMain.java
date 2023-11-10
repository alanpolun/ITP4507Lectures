package Exam2022.Q2;

public class DessertMain {
    public static void main(String[] args) {
        Dessert desserts[] = new Dessert[4];
        desserts[0] = new IceCream("Chocolate", 30, true);
        desserts[1] = new IceCream("Vanilla", 25, false);
        desserts[2] = new CheeseCake("Blueberry", 50, true);
        desserts[3] = new CheeseCake("Strawberry", 45, false);

        for (Dessert dessert : desserts)
            dessert.showDetails();
    }
}
