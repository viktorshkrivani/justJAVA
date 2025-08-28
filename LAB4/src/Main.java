import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String playersThrow = getPlayersThrow();
        String computersThrow = getComputersThrow();
        displayCountDownAndWinner(playersThrow, computersThrow);
    }


    private static void displayCountDownAndWinner(
            String playersThrow, String computersThrow) {
        System.out.println("Rock");
        System.out.println("Paper");
        System.out.println("Scissors");
        System.out.println("Shoot!");


        System.out.println("Player picked: " + playersThrow);
        System.out.println("Computer picked: " + computersThrow);

        if (playersThrow.equals(computersThrow)) {
            System.out.println("TIE!");
        }else if (playersThrow.equals("rock") && computersThrow.equals("scissors") ||
                playersThrow.equals("paper") && computersThrow.equals("rock") ||
                playersThrow.equals("scissors") && computersThrow.equals("paper")) {
            System.out.println("YOU WON!");
        } else  {
            System.out.println("YOU LOST!");
        }

    }

    private static String getComputersThrow() {

        Random random = new Random();
        random.nextInt(1, 4);
        int number1to3 = (int)(Math.random() * 3) + 1;

        if (number1to3 == 1) {
            return "rock";
        } else if (number1to3 == 2) {
            return "paper";
        } else {
            return "scissors";
        }
    }


    private static String getPlayersThrow() {
        Scanner keyword = new Scanner(System.in);
        System.out.println("Enter (rock, paper, or scissors): ");
        String input = keyword.nextLine().toLowerCase();
        while (!input.equals("rock") && !input.equals("paper") && !input.equals("scissors")) {
            System.out.println("Try again and enter rock, paper, or scissors: ");
            input = keyword.nextLine().toLowerCase();
        }
        return input;

    }


}



