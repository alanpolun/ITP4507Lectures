public class Test {
    public static void main(String[] args) {
        Barbarian b = new Barbarian("Conan", 100, 10);
        Wizard w = new Wizard("Gandalf", 50, 20);
        System.out.println("Hero name: " + b.name);
        System.out.println("Hero life: " + b.hp);
        System.out.println("Hero fury: " + b.fury);
        
        System.out.println("Hero name: " + w.name);
        System.out.println("Hero life: " + w.hp);
        System.out.println("Hero mana: " + w.mp);
    }
}
