package Polymorphism;
public class Test3 {
    public static void main(String[] args){
        Hero heroes[] = new Hero[2];
        heroes[0] = new Barbarian("Alan", 1000, 100);
        heroes[1] = new Wizard("Mary", 500, 100);

        for (Hero hero : heroes){
            hero.showStatus();
        } 
    }
}