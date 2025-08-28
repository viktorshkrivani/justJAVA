# Project 0 🪚 — Deck Builder Cost Estimator  

This project is part of **Introduction to Java**. It is a console program that helps a contractor estimate the **materials, labor, and total cost** of building a deck.  


## What it does  

- **Deck and Board Inputs**  
  - Asks for the **length and width of the deck**.  
  - Asks for the **length and width of the boards** being purchased.  
  - Calculates the total deck area, board area, and the **number of boards required**.  

- **Material Costs**  
  - Prompts for the **price per board**.  
  - Calculates total board cost.  
  - Applies a **bulk discount**:  
    - Over $1000 → 10% off  
    - Over $2000 → 15% off  

- **Labor Costs**  
  - Asks for **hours estimated** and **hourly rate**.  
  - Optionally applies a **customer discount** (percentage) to labor only.  

- **Total Project Cost**  
  - Adds together the discounted board cost and the (possibly discounted) labor cost.  
  - Outputs the **final total**.  


## Concepts Practiced  

- Reading input with `Scanner`.  
- Using **arithmetic operations** for area and cost calculations.  
- Applying **if/else logic** for discounts.  
- Using `Math.ceil()` for rounding up (e.g., board count).  
- Combining multiple inputs and calculations into a single program.  

## Example Flow  

1. Enter deck dimensions (length & width).  
2. Enter board dimensions.  
3. Program calculates deck area, board area, and number of boards.  
4. Enter price per board → material cost is shown (with discounts if applicable).  
5. Enter estimated hours & hourly cost → labor cost calculated (with optional discount).  
6. Program prints the **total deck project cost**. 
