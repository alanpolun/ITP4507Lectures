public class Barbarian extends Hero {
    int fury;
    
    public Barbarian(String n, int h, int f){
        super(n, h);
        fury = f;
    }
    
    public void showStatus(){
        System.out.println("Barbarian name: " + name);
        System.out.println("Barbarian life: " + hp);
        System.out.println("Barbarian fury : " + fury);
    }
}