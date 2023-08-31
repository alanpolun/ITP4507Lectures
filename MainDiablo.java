class Hero {
    public String name;
    public int hp;
}

class Barbarian extends Hero {
    public int fury;
} 

class Wizard extends Hero {
    public int mp;
}

public class MainDiablo {
    public static void main(String[] args) {
        Barbarian b = new Barbarian();
        Wizard w = new Wizard();
        
        System.out.println("Hero name: " + b.name);
        System.out.println("Hero life: " + b.hp);
        System.out.println("Hero fury: " + b.fury);
        
        System.out.println("Hero name: " + w.name);
        System.out.println("Hero life: " + w.hp);
        System.out.println("Hero mana: " + w.mp);
    }
}