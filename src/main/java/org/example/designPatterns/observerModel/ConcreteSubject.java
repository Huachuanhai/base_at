package org.example.designPatterns.observerModel;


import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题类
 * @author mac
 */
public class ConcreteSubject implements Subject{

    private List<Observer> observers;

    public ConcreteSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
