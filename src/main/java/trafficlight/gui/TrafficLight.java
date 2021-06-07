package trafficlight.gui;


import java.awt.*;
import trafficlight.observer.Observer;

public class  TrafficLight extends Light implements Observer{

    public TrafficLight(Color color) {
        super(color);
    }

    public void turnOn(boolean a) {
        isOn = a;
        repaint();
    }

    public boolean isOn() {
        return isOn;
    }

    @Override
    public void update() {
        if(!isOn){
            turnOn(true);
        }else{
            turnOn(false);
        }
    }

    //TODO implement a part of the pattern here
}
