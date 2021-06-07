package at.ac.fhcampuswien;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import trafficlight.ctrl.TrafficLightCtrl;
import trafficlight.gui.TrafficLight;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TrafficLightTest {
    @Test
    public void checkGreen() {
        TrafficLight green = new TrafficLight(Color.green);
        assertFalse(green.isOn());
    }


    @Test
    public void checkYellow() {
        TrafficLight yellow = new TrafficLight(Color.yellow);
        assertFalse(yellow.isOn());
    }

    @Test
    public void checkRed() {
        TrafficLight red = new TrafficLight(Color.red);
        assertFalse(red.isOn());
    }
}
