package designPatterns.behavior.observer;

import java.util.ArrayList;
import java.util.List;

// Subject
interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(state);
        }
    }
}

// Observer
interface Observer {
    void update(int state);
}

class ConcreteObserver implements Observer {
    public void update(int state) {
        System.out.println("State updated to: " + state);
    }
}

// Client
public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();

        subject.addObserver(observer);
        subject.setState(1);  // Output: "State updated to: 1"
        subject.setState(2);  // Output: "State updated to: 2"
    }
}
