package designPatterns.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * The Observer Pattern is a behavioral design pattern that defines a subscription mechanism enabling multiple objects to monitor a subject object.
 * When the state of the subject object changes, all subscribing objects (observers) are notified.
 * This pattern is particularly useful for implementing distributed systems where changes in one object need to be reflected in other objects without knowing how many objects need to be updated.
 * The pattern consists of three main components:
 * Subject: The object that holds the information to be observed. It maintains a list of observers and provides methods for adding or removing them.
 * Observer: Interface or abstract class defining the update method that concrete observers must implement.
 * Concrete Observers: Objects that track the state of the subject and implement the update method defined by the Observer.
 */

// Subject
interface Subject {
    void addObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}

// Observer
interface Observer {
    void update(int state);
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
