import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;

        while (!done) {
            System.out.println("1. Manage shop");
            System.out.println("2. Kiosk mode");
            System.out.println("Select an option:");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    ManageShop manageShop = new ManageShop();
                    manageShop.manage(scanner);
                    break;
                case 2:
                    KioskMode kioskMode = new KioskMode();
                    kioskMode.run(scanner);
                    break;
                default:
                    System.out.println("Invalid input, try again.");
                    break;
            }
        }
    }
}