# Project 1 🎮 — Text Adventure Game  

This project is part of **Introduction to Java**. It is a simple text-based adventure game where the player chooses actions, explores directions, and tries to find the secret escape word to win.  


## 🔎 What it does  

- **Player Actions**  
  - Valid options: `north`, `south`, `east`, `west`, `attack`, `sleep`, `escape`  
  - One secret escape word (`run`) also ends the game.  
  - Invalid inputs are rejected, and the program shows the valid options again.  

- **Wounded State**  
  - If the player uses `attack`, they become **wounded**.  
  - While wounded, the **only valid option** is `sleep`.  
  - `sleep` heals the player, allowing them to move again.  

- **Game Loop**  
  - Keeps track of how many **turns** the player spends in the game.  
  - Ends when the player types the secret escape word or `escape`.  
  - Prints a congratulations message along with the number of turns.  


## 🧠 Concepts Practiced  

- Loops (`while` to keep the game running).  
- **Methods** for input validation and action handling.  
- **Conditional logic** (`if/else`, `switch`) for player state and actions.  
- Boolean flags to track conditions (`YouAreWounded`).  
- Counting turns with an integer variable.  
