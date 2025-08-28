import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter 'write' to write receipts, 'read' to read receipts:");

    String input = scanner.nextLine();

    if (input.equals("write")) {
        Writer.writeReceipts();
    } else if (input.equals("read")) {
        Reader.readReceipts();
    } else {
        System.out.println("Invalid input, try again.");
    }
}

}