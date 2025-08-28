# Lab: Pizza Party Calculator  

This program helps determine if you have bought enough pizzas for a party based on the number of guests and their average pizza consumption.  


## 🔎 Explanation  

1. **Imports Scanner**  
   - Uses the `Scanner` class to read input from the user.  

2. **User Input**  
   - Asks the user for:  
     - Number of friends invited to the party  
     - Average number of pizza slices each friend eats  
     - Number of slices in each pizza  
     - Total number of pizzas purchased  

3. **Calculations**  
   - Computes the **total slices needed** by multiplying the number of friends by their average slices.  
   - Calculates the **pizzas required** by dividing total slices needed by slices per pizza.  

4. **Decision Making (if/else)**  
   - If the pizzas required is greater than the pizzas purchased → outputs how many **more pizzas** are needed.  
   - Otherwise → confirms that the user has **enough pizzas** for the party.  

## 📌 Purpose of this Lab  

This lab demonstrates:  
- Taking user input with `Scanner`.  
- Parsing string input into integers with `Integer.parseInt`.  
- Performing arithmetic calculations.  
- Using an `if/else` structure to make decisions and display results.  
