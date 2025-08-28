import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UpdateItem {
    public void update(Scanner scanner) {
        System.out.println("Enter the item name:");
        String name = scanner.nextLine();

        File file = new File(name + ".txt");
        if (!file.exists()) {
            System.out.println("Item does not exist, use Add.");
        } else {
            try {
                FileWriter writer = new FileWriter(file);
                System.out.println("Enter the new quantity on hand:");
                int quantity = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter the new price in $:");
                double price = scanner.nextDouble();
                scanner.nextLine();

                writer.write(quantity + "\n");
                writer.write(price + "\n");
                writer.close();

                System.out.println("Item is updated successfully.");
            } catch (IOException e) {
                System.out.println("Error updating item: " + e.getMessage());
            }
        }
    }
}
