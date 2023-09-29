package Polymorphism;
public class Test4 {
    public static void main(String[] args){
        Hero b = new Barbarian("Alan", 1000, 100);
        Hero w = new Wizard("Mary", 500, 100);
        
        printHero(b);
        printHero(w);
    }
    
    public static void printHero(Hero h){
        h.showStatus();
    }
}