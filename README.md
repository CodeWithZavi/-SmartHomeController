# SmartHomeController

A Java implementation of the **Controller** pattern from GRASP principles.

## Overview

This project simulates a Smart Home system where different devices (Light, Fan, ClimateControl) are controlled via a central controller. The controller handles system commands such as turning devices on/off and setting temperature.

### Features:
- Control lights and fans
- Set the temperature
- Modular design using the Controller pattern

## Implementations

This repository demonstrates two implementations of a Smart Home system that controls devices like lights, fans, and climate control. The project focuses on the application of the **GRASP Controller** principle and contrasts it with a version that does not use a controller.
### 1.With GRASP Controller

This version introduces a HomeController class that manages smart home devices and their commands, following the GRASP Controller principle. This approach promotes better modularity, scalability, and separation of concerns.

### 2. Without GRASP Controller

In this version, each smart home device (Light, Fan, ClimateControl) is directly controlled by the main class (`SmartHomeApp`). This approach tightly couples the main class with the device control logic, making the system harder to maintain and extend.

#### Code Example:

```java
Light light = new Light();
Fan fan = new Fan();
ClimateControl climateControl = new ClimateControl();

// Direct control without a controller
light.turnOn();
fan.turnOff();
climateControl.setTemperature(22);
