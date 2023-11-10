package Exam2022.Q4;

public class Petrol {
    private int volume = 0; // the amount of petrol
    private double averageCost = 0; // the average cost of petrol

    public void buy(int vol, double cost) {
        averageCost = (volume * averageCost + vol * cost) / (volume + vol);
        volume += vol;
    }

    public void sell(int vol) {
        volume -= vol;
    }

    public int getVolume() {
        return volume;
    }

    public double getAverageCost() {
        return averageCost;
    }

    public void setVolume(int vol) {
        volume = vol;
    }

    public void setAverageCost(double cost) {
        averageCost = cost;
    }

    public String toString() {
        return volume + " litre petrol in stock at an average cost $" + averageCost;
    }
} // Petrol

class PetrolMemento {
    private int volume;
    private double averageCost;
    private Petrol petrol;

    public PetrolMemento(Petrol petrol) {
        this.volume = petrol.getVolume();
        this.averageCost = petrol.getAverageCost();
        this.petrol = petrol;
    }

    public Petrol getPetrol() {
        return petrol;
    }

    public void restore() {
        this.petrol.setVolume(volume);
        this.petrol.setAverageCost(averageCost);
    }
}