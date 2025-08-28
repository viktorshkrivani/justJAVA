import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KioskMode {
    private double balance;

    public void run(Scanner scanner) {
        System.out.println("Enter how much money you have to spend in $:");
        balance = scanner.nextDouble();
        int purchaseQuantity = 0;
        scanner.nextLine();

        Map<String, Integer> itemsPurchased = new HashMap<>();

        boolean done = false;
        while (!done) {
            System.out.println("Enter name to purchase:");
            String name = scanner.nextLine();

            File file = new File(name + ".txt");
            if (!file.exists()) {
                System.out.println("Item does not exist.");
            } else {
                try {
                    Scanner fileScanner = new Scanner(file);
                    int quantity = fileScanner.nextInt();
                    double price = fileScanner.nextDouble();
                    fileScanner.close();

                    System.out.println("Price: $" + price + " Quantity available: " + quantity);

                    System.out.println("How many do you want to buy?");
                    purchaseQuantity = scanner.nextInt();
                    scanner.nextLine();

                    double totalCost = price * purchaseQuantity;
                    if (totalCost > balance) {
                        System.out.println("Not enough money. Try again.");
                    } else {
                        balance -= totalCost;

                        if (purchaseQuantity < quantity) {
                            try {
                                FileWriter writer = new FileWriter(file);
                                writer.write((quantity - purchaseQuantity) + "\n");
                                writer.write(price + "\n");
                                writer.close();

                                System.out.println("Item is purchased successfully.");
                            } catch (IOException e) {
                                System.out.println("Error updating item quantity: " + e.getMessage());
                            }
                        } else {
                            if (!file.delete()) {
                                System.out.println("Error deleting item.");
                            }
                        }

                        itemsPurchased.put(name, purchaseQuantity);
                        System.out.println("Item purchased: " + name + " Quantity: " + purchaseQuantity + " Total cost: $" + totalCost);

                        System.out.println("Balance remaining: $" + balance);
                    }
                } catch (IOException e) {
                    System.out.println("Error getting item details: " + e.getMessage());
                }
            }

            System.out.println("Are you done shopping? (Yes/No)");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("Yes")) {
                done = true;
            }
        }

        System.out.println("Receipt:");

        double grandTotal = 0;
        for (Map.Entry<String, Integer> entry : itemsPurchased.entrySet()) {
            String name = entry.getKey();
            int quantity = entry.getValue();

            File file = new File(name + ".txt");
            if (file.exists()) {
                try {
                    Scanner fileScanner = new Scanner(file);
                    int totalquantity = fileScanner.nextInt();
                    double price = fileScanner.nextDouble();
                    fileScanner.close();

                    double totalCost = price * purchaseQuantity;
                    grandTotal += totalCost;

                    System.out.println(name + " Quantity: " + quantity + " Total cost: $" + totalCost);
                } catch (IOException e) {
                    System.out.println("Error with item details: " + e.getMessage());
                }
            }
        }

        System.out.println("Grand Total: $" + grandTotal);

    }
}
