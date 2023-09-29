public class Main {
    public static void main (String[] args) {
        Deer deer = new Deer("Bambi", 2);
        Horse horse = new Deer2HorseAdapter(deer);
        Client.ShowDetail(horse);
    }
}