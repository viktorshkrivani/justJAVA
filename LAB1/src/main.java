//Write a program that helps the user estimate how much longer and how much more cost they have to compete their degree.
//Ask the user to enter the # of credits completed they have.
//Ask the user to enter the total # of credits required for their degree
//Ask the user enter how many credits they take per semester on average
//Ask the user to enter the cost per credit
//Calculate the # of semesters remaining ( rounded up with Math.ceil )
//output
//the # of semesters remaining and estimated cost

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Press ENTER to estimate the remaining of your degree.");
        number.nextLine();
        System.out.println("Enter how many credit you have COMPLETED: ");
        int completed = number.nextInt();
        System.out.println("Enter the total credit REQUIRED to complete the degree: ");
        int required = number.nextInt();
        System.out.println("Enter how many credits in AVERAGE you take for semester: ");
        int average = number.nextInt();
        System.out.println("Enter the COST per credit: ");
        double cost = number.nextDouble();

        int totaluncompleted = required - completed;
        double remaining = Math.ceil((double) totaluncompleted / average);
        double estimatedcost = totaluncompleted * cost;

        System.out.println("The number of the *SEMESTER REMAINING*: " + remaining);
        System.out.println("The *ESTIMATED COST* to finish your degree: $" + estimatedcost);

    }
}
