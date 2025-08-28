import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bottle Bottle = new Bottle(1000, "Juice");
        System.out.println("You have a " + Bottle.getBeverageName() + " bottle with a maximum volume of " + Bottle.getMaxVolumeInMilliliters() + " milliliters.");
        System.out.println("The bottle currently contains " + Bottle.getCurrentVolumeInMilliliters() + " milliliters.");
        System.out.print("Do you want to refill the bottle? (yes or no) ");


        String refill = scanner.next();

        if (refill.equals("yes")) {
            System.out.print("How many milliliters do you want to fill? ");
            int millilitersToFill = scanner.nextInt();
            boolean Fill = Bottle.fill(millilitersToFill);
            if (Fill) {
                System.out.println("You filled the bottle with " + millilitersToFill + " milliliters.");
            } else {
                System.out.println("You can't fill the bottle with " + millilitersToFill + " milliliters. The bottle can only hold "
                        + Bottle.getMaxVolumeInMilliliters() + " milliliters.");
            }

            System.out.println("The bottle now contains " + Bottle.getCurrentVolumeInMilliliters() + " milliliters.");
        } else {
            System.out.println("Ok, the bottle will not be refilled.");
        }

        System.out.print("How many milliliters do you want to drink? ");
        int millilitersToDrink = scanner.nextInt();

        boolean Drink = Bottle.drink(millilitersToDrink);
        if (Drink) {
            System.out.println("You just consumed " + millilitersToDrink + " milliliters.");
        } else {
            System.out.println("You can't drink " + millilitersToDrink + " milliliters. The bottle only contains "
                    + Bottle.getCurrentVolumeInMilliliters() + " milliliters.");
        }
        System.out.println("The bottle now contains " + Bottle.getCurrentVolumeInMilliliters() + " milliliters.");




    }
}