# Lab 1: Degree Completion Estimator  

This program helps students estimate **how many semesters** and **how much cost** remain to complete their degree.  

## 🔎 Explanation  

1. **Imports Scanner**  
   - The program uses the `Scanner` class to collect input from the user through the console.  

2. **User Input**  
   - Prompts the user to enter:  
     - Number of credits **already completed**  
     - Total credits **required** for the degree  
     - Average **credits per semester**  
     - **Cost per credit**  

3. **Calculations**  
   - Determines the **remaining credits** by subtracting completed credits from the required credits.  
   - Calculates the **number of semesters left** by dividing the remaining credits by average credits per semester.  
   - Uses `Math.ceil` to round up, since a partial semester still counts as a whole.  
   - Computes the **estimated cost** by multiplying remaining credits by cost per credit.  

4. **Output**  
   - Displays the number of semesters remaining.  
   - Displays the estimated total cost to finish the degree.  


## 📌 Purpose of Lab 1  

This lab introduces students to:  
- Collecting input with `Scanner`.  
- Performing arithmetic operations in Java.  
- Using `Math.ceil` for rounding.  
- Outputting results to the console.  
