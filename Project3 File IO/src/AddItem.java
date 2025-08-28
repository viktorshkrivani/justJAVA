import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddItem {
    public void add(Scanner scanner) {
        System.out.println("Enter the item name:");
        String name = scanner.nextLine();

        File file = new File(name + ".txt");
        if (file.exists()) {
            System.out.println("Item already exists, use Update or Delete.");
        } else {
            try {
                FileWriter writer = new FileWriter(file);
                System.out.println("Enter the quantity on hand:");
                int quantity = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter the price in $:");
                double price = scanner.nextDouble();
                scanner.nextLine();

                writer.write(quantity + "\n");
                writer.write(price + "\n");
                writer.close();

                System.out.println("Item is added successfully.");
            } catch (IOException e) {
                System.out.println("Error adding item: " + e.getMessage());
            }
        }
    }
}
