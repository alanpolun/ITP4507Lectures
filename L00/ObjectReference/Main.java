//package ObjectReference;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(30, 40);
        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
        r1 = r2;  //object reference, pointer, linking
        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
        r2.height = 150;
        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);

 
        Client.ChangeRectangle(new Rectangle(r1));
        System.out.println("r1: " + r1);

        int x = 10;
        Client.ChangeX(x);
        System.out.println("x: " + x);

/*
       int x=10, y =20;
       x = y;
       x = 30;
       System.out.println("x: "+x + " y: "+y);
       */
    }
    
}
