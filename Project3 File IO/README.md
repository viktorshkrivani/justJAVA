# Project 3 🛒 — Shop Management & Kiosk System  

This project is part of **Introduction to Java** and implements a small-scale **inventory and sales system**. It uses text files as the database, where each item is stored in a separate `.txt` file containing its quantity and price.  

The program has two main modes:  

- **Manage Shop Mode**  
  - Add new items to the inventory.  
  - Update the quantity and price of existing items.  
  - Delete items from the inventory.  
  - Each item is stored in a dedicated text file (e.g., `pen.txt`, `cOK.txt`).  

- **Kiosk Mode**  
  - Allows a customer to enter their available balance.  
  - Customers can purchase items by name, with quantities deducted from the file.  
  - Prevents purchases if the customer does not have enough money or if stock runs out.  
  - Tracks all purchases in one session and prints a **receipt** showing items, quantities, and the total spent.  


## 🧠 Concepts Practiced  

- **File I/O**: reading, writing, updating, and deleting text files for inventory management.  
- **Encapsulation & Classes**: separate responsibilities handled by classes like `AddItem`, `UpdateItem`, `DeleteItem`, `KioskMode`, and `ManageShop`.  
- **Collections**: use of `HashMap` to track purchases in kiosk mode.  
- **Control Flow**: menu-driven navigation with loops and switch cases.  
- **Error Handling**: handling invalid inputs and exceptions (`IOException`, `InputMismatchException`).  


## 📌 Purpose  

This project combines **object-oriented programming** and **file management** to simulate how a simple shop system works — giving practice with **data persistence**, **user interaction**, and **system design**.  
