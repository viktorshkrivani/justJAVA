import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {

    public static void readReceipts() {
        try {
            File file = new File("receipts.txt");
            Scanner fileScanner = new Scanner(file);

            double total = 0;
            int count = 0;

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                double value = Double.parseDouble(line);

                total += value;
                count++;
            }

            fileScanner.close();
            System.out.println("Total receipts: " + count);
            System.out.println("Total value: $" + total);
            System.out.println("Average receipt value: $" + (Math.ceil(total / count)));
        } catch (FileNotFoundException e) {
            System.out.println("Receipts file not found.");
        }
    }
    }

