package org.example.designPatterns.observerModel;

/**
 * 观察者测试类
 * @author mac
 */
public class ObserverMainTest {

    public static void main(String[] args) {
        //创建观察者和对象
        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");
        Subject subject = new ConcreteSubject();

        //政策观察者
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        //发送消息通知观察者
        subject.notifyObservers("本喵叫兔兔");

        //移除观察者
        subject.removeObserver(observer1);

        // 再次发送消息
        subject.notifyObservers("Goodbye!");
    }
}
