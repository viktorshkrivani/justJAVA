import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writer {
    public static void writeReceipts() {
        Scanner scanner = new Scanner(System.in);
        try {
            FileWriter writer = new FileWriter("receipts.txt");

            System.out.println("Start writing receipt totals. Type 'done' when finished:");
            String receiptInput = scanner.nextLine();

            double total = 0;
            int count = 0;

            while (!receiptInput.equals("done")) {
                double value = Double.parseDouble(receiptInput);
                writer.write(value + "\n");

                total += value;
                count++;

                receiptInput = scanner.nextLine();
            }

            writer.close();
            System.out.println("Saved in receipts.txt file.");
            Reader.readReceipts();
        } catch (IOException e) {
            System.out.println("Error writing the receipts.");
        }
    }
}
