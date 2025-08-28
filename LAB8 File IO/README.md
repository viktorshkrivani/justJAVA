# Lab: Receipts (File I/O)

This console app **writes** receipt totals to a file and **reads** them back to show summary stats.


## What it does
- On start, prompts for **`write`** or **`read`**.
- **write**: asks you to enter receipt amounts (one per line) until you type **`done`**.  
  - Saves them to **`receipts.txt`** (overwrites existing file).  
  - Then immediately reads the file to display stats.
- **read**: opens **`receipts.txt`** and calculates:
  - **Total receipts (count)**
  - **Total value (sum)**
  - **Average value** (rounded up with `Math.ceil`)

If the file doesn’t exist during **read**, it prints a friendly message.


## Concepts practiced
- **File I/O** with `FileWriter`, `Scanner`
- **Parsing** numbers from text
- **Accumulation** (sum, count) and **average**
- **Basic error handling** (`FileNotFoundException`, `IOException`)


## How to use (quick)
1. Run the program.
2. Type **`write`** to enter amounts (e.g., `12.50`, `7.99`, …), then **`done`**.  
   – or –  
   Type **`read`** to summarize the existing **`receipts.txt`**.
