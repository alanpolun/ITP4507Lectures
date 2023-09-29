public class Deer {
    public String name;
    public int age;
    
    public Deer(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void walking() {
        System.out.println("Deer " + name + " is walking.");
    }

    public void DeerDetail() {
        System.out.println("Deer name: " + name);
        System.out.println("Deer age: " + age);
    }
}