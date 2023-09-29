public class Deer2 {
    public String name;
    public int age;
    
    public Deer2(String name, int age) {
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