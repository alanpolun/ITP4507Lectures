public class DeerHorseAdapter extends Deer2 implements Horse2{
    public DeerHorseAdapter(String name, int age) {
        super(name, age);
    }
    
    public void run() {
        super.walking();
    }

    public void HorseDetail() {
        super.DeerDetail();
    }
    
}
