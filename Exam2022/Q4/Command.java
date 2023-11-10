package Exam2022.Q4;

public interface Command {
    public void execute();
    public void undo();
}

class BuyCommand implements Command {
    private Petrol petrol;
    private int vol;
    private double cost;
    private PetrolMemento memento;

    public BuyCommand(Petrol petrol, int vol, double cost) {
        this.petrol = petrol;
        this.vol = vol;
        this.cost = cost;
    }

    public void execute() {
        memento = new PetrolMemento(petrol);
        petrol.buy(vol, cost);
    }

    public void undo() {
        memento.restore();
    }
}

class SellCommand implements Command {
    private Petrol petrol;
    private int vol;
    private PetrolMemento memento;

    public SellCommand(Petrol petrol, int vol) {
        this.petrol = petrol;
        this.vol = vol;
    }

    public void execute() {
        memento = new PetrolMemento(petrol);
        petrol.sell(vol);
    }

    public void undo() {
        memento.restore();
    }
}