public class Deer2HorseAdapter extends Horse {
    private Deer deer;
    
    public Deer2HorseAdapter(Deer deer) {
        super(deer.name, 20, 0);
        this.deer = deer;
    }
    
    public void run() {
        deer.walking();
    }

    public void HorseDetail() {
        deer.DeerDetail();
    }
}