# SmartHomeController

A Java implementation of the **Controller** pattern from GRASP principles.

## Overview

This project simulates a Smart Home system where different devices (Light, Fan, ClimateControl) are controlled via a central controller. The controller handles system commands such as turning devices on/off and setting temperature.

### Features:
- Control lights and fans
- Set the temperature
- Modular design using the Controller pattern

## Code Example

```java
// Sample command execution
controller.handleCommand("turn on light");
controller.handleCommand("turn off fan");
controller.handleCommand("set temperature 22");

