# Lab: Bottle Class Simulation  

This lab focuses on **object-oriented programming (OOP)** in Java.  
It introduces creating a custom class (`Bottle`) with attributes, constructors, methods, and unit tests.  


## 🔎 Explanation  

### Main Program  
- Creates a `Bottle` object with a maximum volume and a beverage name.  
- Prints out the bottle’s current state.  
- Gives the user the option to **refill** the bottle:  
  - If the amount to fill fits within the maximum capacity → updates the current volume.  
  - Otherwise → prevents overfilling and displays a message.  
- Prompts the user for how much they want to **drink**:  
  - If enough liquid is available → decreases current volume.  
  - Otherwise → shows an error that there isn’t enough to drink.  
- At the end, displays the updated bottle volume.  

### Bottle Class  
- **Attributes:**  
  - `maxVolumeInMilliliters` → maximum capacity of the bottle.  
  - `currentVolumeInMilliliters` → how much liquid is currently inside.  
  - `beverageName` → the type of drink (e.g., Juice).  

- **Constructors:**  

- **Getters/Setters:**   

- **Methods:**  
  - `drink(int millilitersToDrink)` → reduces current volume if enough is available, returns `true`; otherwise returns `false`.  
  - `fill(int millilitersToFill)` → adds to the bottle’s volume if within capacity, returns `true`; otherwise prevents overflow and returns `false`.  

### Unit Testing  
Two JUnit test classes verify functionality:  

- **`BottleTest1`**  
  - **Drink test**: Confirms that drinking decreases volume correctly and fails if attempting to drink more than available.  
  - **Fill test**: Confirms that filling increases volume properly and fails if trying to overfill.  

- **`BottleTest2`**  
  - Empty template with method stubs (`drink` and `fill`) for additional test cases.  


## 📌 Purpose of this Lab  

This lab demonstrates:  
- Designing and implementing a custom class in Java.  
- Using constructors, attributes, and encapsulation with getters and setters.  
- Adding behavior to a class with methods that enforce rules (like no overfilling).  
- Writing **JUnit tests** to validate methods and ensure correctness.  
- Practicing interaction between a main program and custom class objects. 
