class Light {
    public void turnOn() {
        System.out.println("Light is turned ON");
    }

    public void turnOff() {
        System.out.println("Light is turned OFF");
    }
}

class Fan {
    public void turnOn() {
        System.out.println("Fan is turned ON");
    }

    public void turnOff() {
        System.out.println("Fan is turned OFF");
    }
}

class ClimateControl {
    public void setTemperature(int temp) {
        System.out.println("ClimateControl temperature set to " + temp + " degrees");
    }
}

public class SmartHomeApp1 {
    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();
        ClimateControl climateControl = new ClimateControl();

       
        light.turnOn();
        fan.turnOff();
        climateControl.setTemperature(22);
    }
}
