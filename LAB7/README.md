# Lab: Tic-Tac-Toe (Console)

This program is a simple **Tic-Tac-Toe** game played in the console between two players (X and O).  


## 🔎 Explanation  

- The game board is stored in a **3×3 array**, with each slot holding `'X'`, `'O'`, or blank.  
- The **current player** starts as X and alternates after each valid move.  
- The program asks the user for a row and column (0–2) to place their mark.  
- Invalid moves (out of range or occupied) are rejected, and the user must try again.  
- The game ends when either:  
  - A player wins (three in a row, column, or diagonal), or  
  - The board is full (tie).  


## 📌 Purpose  

This lab practices:  
- Using 2D arrays.  
- Loops and input validation.  
- Basic game logic and win/tie conditions.  
- Separating logic (`TicTacToe` class) from user interaction (`Main` class).  
