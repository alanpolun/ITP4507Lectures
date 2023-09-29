package Polymorphism;
abstract public class Hero {
    String name;
    int hp;
    
    public Hero(String n, int h){
        name = n;
        hp = h;
    }
    
    public abstract void showStatus();
}


