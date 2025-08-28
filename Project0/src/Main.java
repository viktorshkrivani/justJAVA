/*Please submit the URL to your main.java file AND a self assessment using the rubric
Write a program that helps your contractor friend build a deck.
we need to get the length and width of the deck.
ask them for the length and width of the board they are going buy.
we need to calculate the number of boards required for the deck
ask them for the price per board - calculate total cost of boards
Our friendly home improvement offers a bulk discount
If we are buying more than $1000 in boards, we get 10% off
if we are buying more than $2000 in boards, we get 15% off
ask for a time estimate and the $ per hour they charge
sk them for wether or not the custom gets a discount
if they get a discount, ask for the % discount
the discount only applies to the time cost, not the board cost
calculate the total of the project with materials and labor
output the total cost*/



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner deck = new Scanner(System.in);


        System.out.print("Enter LENGTH of the DECK (ft): ");
        double decklength = deck.nextDouble();
        System.out.print("Enter the WIDTH of the DECK (ft): ");
        double deckwidth = deck.nextDouble();

        System.out.print("Enter the LENGTH of the BOARDS (ft): ");
        double boardLength = deck.nextDouble();
        System.out.print("Enter the WIDTH of the BOARDS (ft): ");
        double boardWidth = deck.nextDouble();
        double deckArea = decklength * deckwidth;
        double boardArea = boardLength * boardWidth;
        double numberBoards = Math.ceil(deckArea / boardArea);

        System.out.println("Deck area is = " +deckArea+ " ft");
        System.out.println("Board area is = " +boardArea+ " ft");
        System.out.println("Number of boards is = " +numberBoards);

        System.out.print("How much is the price for each board? ");
        double priceBoard = deck.nextDouble();
        double costBoards = Math.ceil(numberBoards * priceBoard);
        System.out.println("Price for board is:$ " +costBoards);

        double discount = 0;
        if (costBoards > 2000) {
            discount = 0.15;
        } else if (costBoards > 1000) {
            discount = 0.1;
        }
        double discountCost = Math.ceil (costBoards - (costBoards * discount));
        System.out.println("The total cost of the boards is $ " + discountCost);

        System.out.print("How many hours is the job estimated to take? ");
        double hoursEstimated = deck.nextDouble();
        System.out.print("What is the cost for an hour of work? ");
        double costHour = deck.nextDouble();


        System.out.print("Does the customer get a discount(yes/no) ? ");
        String yesDiscount = deck.next();
        double costofJob = hoursEstimated * costHour;
        if (yesDiscount.equals("yes")) {
            System.out.print("What is the discount percentage? ");
            double percentageDiscount = deck.nextDouble() / 100;
            costofJob = costofJob - (costofJob * percentageDiscount);
            System.out.println("The cost of work is $" + costofJob);
        }


        double totalCost = discountCost + costofJob;


        System.out.println("The total cost of the DECK is $" + totalCost);
    }
}