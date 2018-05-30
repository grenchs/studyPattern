package ch16_observer;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {

    private ArrayList observers = new ArrayList<>();

    public void addObsver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObsver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        Iterator it = observers.iterator();
        while (it.hasNext()) {
            Observer ob = (Observer) it.next();
            ob.update(this);
        }
    }

    public abstract int getNumber();

    public abstract void execute();

}
