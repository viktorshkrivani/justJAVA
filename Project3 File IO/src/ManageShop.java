import java.util.InputMismatchException;
import java.util.Scanner;

public class ManageShop {
    public void manage(Scanner scanner) {
        boolean done = false;
        while (!done) {
            System.out.println("1. Add item");
            System.out.println("2. Update item");
            System.out.println("3. Delete item");
            System.out.println("4. Quit");
            System.out.println("Select an option:");

            try {

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        AddItem addItem = new AddItem();
                        addItem.add(scanner);
                        break;
                    case 2:
                        UpdateItem updateItem = new UpdateItem();
                        updateItem.update(scanner);
                        break;
                    case 3:
                        DeleteItem deleteItem = new DeleteItem();
                        deleteItem.delete(scanner);
                        break;
                    case 4:
                        done = true;
                        break;
                    default:
                        System.out.println("Invalid input, try again.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter a number.");
                scanner.nextLine();
            }
        }
    }
}
