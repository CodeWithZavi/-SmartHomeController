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

// Controller class following the GRASP "Controller" Principle
class HomeController {
    private Light light;
    private Fan fan;
    private ClimateControl climateControl;

    // HomeController acts as an intermediary to manage components
    public HomeController(Light light, Fan fan, ClimateControl climateControl) {
        this.light = light;
        this.fan = fan;
        this.climateControl = climateControl;
    }

    public void handleCommand(String command) {
        switch (command) {
            case "turn on light":
                light.turnOn();
                break;
            case "turn off light":
                light.turnOff();
                break;
            case "turn on fan":
                fan.turnOn();
                break;
            case "turn off fan":
                fan.turnOff();
                break;
            case "set temperature 22":
                climateControl.setTemperature(22);
                break;
            default:
                System.out.println("Invalid command!");
        }
    }
}

public class SmartHomeApp {
    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();
        ClimateControl climateControl = new ClimateControl();

        // Using the HomeController to manage all interactions
        HomeController controller = new HomeController(light, fan, climateControl);

        // Controller processes commands instead of direct interaction
        controller.handleCommand("turn on light");
        controller.handleCommand("turn off fan");
        controller.handleCommand("set temperature 22");
    }
}
