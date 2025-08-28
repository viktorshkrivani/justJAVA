# Project 2 🚗⚡ — Electric Vehicle Simulator  

This project is part of **Introduction to Java**. It simulates a simple **electric vehicle (EV)** where the user can charge the battery, drive the car, and check the current battery status.  


## What it does  

- **Vehicle Setup**  
  - Prompts the user for the battery capacity (kWh), efficiency (km per kWh), and vehicle details (make, model, color).  
  - Creates an `ElectricVehicle` object with these attributes.  

- **Menu Options**  
  1. **Check battery status** → shows current and maximum kWh.  
  2. **Drive the vehicle** → user enters a distance; if enough battery is available, the energy is reduced accordingly, otherwise a warning is shown.  
  3. **Charge the vehicle** → user enters an amount to charge; charging is allowed up to the maximum battery capacity.  
  4. **Exit** → quits the program.  

- **Battery Rules**  
  - Driving reduces battery proportional to distance and efficiency.  
  - Driving further than possible is rejected.  
  - Overcharging is prevented and displays an error message.  


## Concepts Practiced  

- **Object-Oriented Programming (OOP)**:  
  - Encapsulation with private attributes and public getters/setters.  
  - Methods to handle behavior (`drive`, `charge`).  

- **Input Handling** with `Scanner`.  
- **Control Flow** with `switch` statements and loops.  
- **Unit Testing** with JUnit to validate driving and charging logic.  


## Unit Tests  

- **Drive tests**  
  - Driving without charge is rejected.  
  - Driving reduces battery correctly when possible.  

- **Charge tests**  
  - Charging within the limit works.  
  - Overcharging fails without changing the battery.  
  - Charging exactly to the max works correctly.  

