import java.io.File;
import java.util.Scanner;

public class DeleteItem {
    public void delete(Scanner scanner) {
        System.out.println("Enter the item name:");
        String name = scanner.nextLine();

        File file = new File(name + ".txt");
        if (!file.exists()) {
            System.out.println("Item does not exist.");
        } else {
            if (file.delete()) {
                System.out.println("Item is deleted successfully.");
            } else {
                System.out.println("Error deleting item.");
            }
        }
    }
}
