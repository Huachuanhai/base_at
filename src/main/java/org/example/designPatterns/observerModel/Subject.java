package org.example.designPatterns.observerModel;

/**
 * 主题接口
 * @author mac
 */
public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}
