/*Write a program that allows someone to calculate the average score of a test.
Keep a running total of scores, and at the end, divide by the number of scores entered.
Display the average score.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        System.out.println("Enter the number of TEST SCORES: ");
        int testScores = test.nextInt();
        int totaltest = 0;


        for (int i = 0; i < testScores; i++) {
            System.out.println("Enter your test score for #" + (i + 1) + ": ");
            int score = test.nextInt();
            totaltest += score;
        }

        double averageall = (double) totaltest / testScores;
        System.out.println("The average score is: " + averageall);

    }
}