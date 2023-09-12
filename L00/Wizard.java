public class Wizard extends Hero {
    int mp;

    public Wizard(String n, int h, int m){
        super(n, h);
        mp = m;
    }

    public void showStatus(){
        System.out.println("Wizard name: " + name);
        System.out.println("Wizard life: " + hp);
        System.out.println("Wizard mp : " + mp);
    }

}
