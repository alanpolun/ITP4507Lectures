public class Horse {
    public String name;
    public int hp;
    public int speed;
    
    public Horse(String name, int hp, int speed) {
        this.name = name;
        this.hp = hp;
        this.speed = speed;
    }
    
    public void run() {
        System.out.println("Horse " + name + " is running at " + speed + " km/h");
    }

    public void HorseDetail() {
        System.out.println("Horse name: " + name);
        System.out.println("Horse life: " + hp);
        System.out.println("Horse speed: " + speed);
    }
}