import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pizza = new Scanner(System.in);

        // System.out.println("Press Enter to Start calculating the food needed for the party.");
        // pizza.nextLine();

        System.out.println("How many friends are coming to the party? ");
        int FriendsInvited = Integer.parseInt(pizza.nextLine());

        System.out.println("How many slices of pizza your friends eat on average? ");
        int AveragePerPerson = Integer.parseInt(pizza.nextLine());

        System.out.println("How many slices of pizza are in each pizza? ");
        int SlicesPerPizza = Integer.parseInt(pizza.nextLine());

        System.out.println("How many pizzas are you buying?" );
        int TotalPizza = Integer.parseInt(pizza.nextLine());

        int TotalSlices = FriendsInvited * AveragePerPerson;
        double PizzaRequired = (double)TotalSlices / SlicesPerPizza;

        if (PizzaRequired > TotalPizza) {
            System.out.println("There's is not enough pizzas. You need to buy " + (PizzaRequired - TotalPizza) + " more.");
        }else {
            System.out.println("You have enough pizzas for your friends.");
        }


    }
    }
