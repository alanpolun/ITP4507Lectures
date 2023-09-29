package ObjectReference;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(30, 40);
        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
        r1 = r2;
        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
        r1.height = 50;
        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);

        Client.ChangeRectangle(r1);
        System.out.println("r1: " + r1);

        int x = 10;
        Client.ChangeX(x);
        System.out.println("x: " + x);
    }
    
}
