import java.util.*;

public class Caretaker {

    private Stack<Memento> undoList;

    public Caretaker() {
        undoList = new Stack<Memento>();
    }

    public void saveMyClass(Originator mc) {
        Memento amemento = new Memento(mc);
        undoList.push(amemento);
    }

    public void undo() {
        if (!undoList.isEmpty()) {
            Memento m = undoList.pop();
            m.restore();
        }
    }
}
