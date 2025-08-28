# Lab 4: Rock-Paper-Scissors (Console)

This program lets the user play **Rock-Paper-Scissors** against the computer in the console. It validates input, prints a “countdown,” then announces the winner based on standard game rules.


## 🔎 Explanation

- **Program flow**
  1. Prompts the player to enter **rock**, **paper**, or **scissors** (input is forced to be valid).
  2. Randomly generates the computer’s throw.
  3. Prints a quick “Rock, Paper, Scissors, Shoot!” countdown.
  4. Displays both choices and announces **win / lose / tie**.

- **Input handling**
  - Reads a line from the keyboard and converts it to lowercase.
  - Loops until the input is exactly one of: `rock`, `paper`, `scissors`.

- **Computer’s throw**
  - Generates a random integer in the range 1–3 and maps it to:
    - `1 → rock`, `2 → paper`, `3 → scissors`.

- **Winner logic**
  - If both throws match → **TIE**.
  - Player **wins** when:
    - rock beats scissors
    - paper beats rock
    - scissors beat paper
  - Otherwise, the **computer wins**.

- **Structure**
  - `main` orchestrates the game by calling:
    - `getPlayersThrow()` → validated user input
    - `getComputersThrow()` → random choice
    - `displayCountDownAndWinner(p, c)` → prints countdown, choices, and result
