package org.example.designPatterns.observerModel;

/**
 * 具体观察者类
 * @author mac
 */
public class ConcreteObserver implements Observer{

    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " 收到消息: " + message);
    }
}
