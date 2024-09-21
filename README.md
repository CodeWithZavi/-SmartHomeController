# SmartHomeController

A Java implementation of the **Controller** pattern from GRASP principles.

## Overview

This project simulates a Smart Home system where different devices (Light, Fan, Thermostat) are controlled via a central controller. The controller handles system commands such as turning devices on/off and setting thermostat temperature.

### Features:
- Control lights and fans
- Set the thermostat temperature
- Modular design using the Controller pattern

## Code Example

```java
// Sample command execution
controller.handleCommand("turn on light");
controller.handleCommand("turn off fan");
controller.handleCommand("set temperature 22");
## Output
Light is turned ON
Fan is turned OFF
ClimateControl temperature set to 22 degrees

