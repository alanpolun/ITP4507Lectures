package Exam2022.Q2;

public abstract class Dessert {
    private String name;
    protected double price;

    public Dessert(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract void showDetails();
} // class Dessert

class IceCream extends Dessert {
    private boolean withCone;

    public IceCream(String name, double price, boolean withCone) {
        super(name, price);
        this.withCone = withCone;
        this.price = withCone ? price * 1.5 : price;
    }

    public void showDetails() {
        System.out.println("Price of " + this.getName() + " ice-cream: $" + this.getPrice());
    }
} // class IceCream

class CheeseCake extends Dessert {
    private boolean withJam; // for cheese cake only

    public CheeseCake(String name, double price, boolean withJam) {
        super(name, price);
        this.withJam = withJam;
        this.price = withJam ? price + 20 : price;
    }

    public void showDetails() {
        System.out.println("Price of " + this.getName() + " cheese cake: $" + this.getPrice());
    }
} // class CheeseCake