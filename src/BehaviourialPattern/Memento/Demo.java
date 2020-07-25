package BehaviourialPattern.Memento;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Life.Memento> savedTimes = new ArrayList<Life.Memento>();
        Life life = new Life();
        life.set("1000 B.C.");
        savedTimes.add(life.saveToMemento());
        life.set("1000 A.D.");
        savedTimes.add(life.saveToMemento());
        life.set("2000 A.D.");
        savedTimes.add(life.saveToMemento());
        life.set("4000 A.D.");
        life.restoreFromMemento(savedTimes.get(0));
    }


}
