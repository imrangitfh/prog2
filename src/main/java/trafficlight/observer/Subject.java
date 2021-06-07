package trafficlight.observer;

import java.util.ArrayList;

public class Subject {
    private ArrayList<Observer> observerList = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }
    public void notifyObserver(){
        for (Observer observer : this.observerList){
            observer.update();
        }
    }
}
