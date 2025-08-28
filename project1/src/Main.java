/*given a set of valid options, 4 directions and 4 actions - and the secret escape word is valid as well
if they enter an invalid option, display the valid options
using a method, get a valid option from the user
using methods, display what happens from that action
one of the actions should 'wound' the player.  if a player is wounded,
they can't do anything other than sleep, other choices are invalid because they are wounded

Include a 'sleep' action that will heal the player, after they sleep, they can travel again.
track the # of turns the player spends in the game
there is a secret 'escape word' that will end the game tell them congratulations
thanks for playing and how many turns they wasted playing the game */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean YouAreWounded= false;
        int turns = 0;
        String escapeWord = "run";

        while(true){
            if(YouAreWounded) {
                System.out.println("You are wounded and there's nothing you can do other than sleep.");
                System.out.println("What do you want to do? (sleep)");
            } else {
                System.out.println("What do you want to do? (north, south, east, west, attack, sleep, escape)");
            }
            String action = input.nextLine().toLowerCase();

            if (!ValidOpt(action)){
                System.out.println("INVALID OPTION. Use: north, south, east, west, attack, sleep, escape");
                continue;
            }
            if (action.equals(escapeWord)) {
                System.out.println("Congratulations, you escaped the game in " + turns + " turns. Thanks for playing!");
                break;
            }
            if(action.equals("escape")) {
                System.out.println("CONGRATULATIONS, you escaped the game in " + turns + " turns. Thanks for playing the game!");
                break;
            }
            if (action.equals("sleep")) {
                System.out.println("You are sleeping and healing your wounds");
                YouAreWounded = false;
                turns++;
                continue;
            }
            if (YouAreWounded){
                System.out.println("You can't do anything other than sleep.");
                continue;
            }
            System.out.println("You chose " +action);
            performAction(action);
            turns++;
            if (action.equals("attack")){
                System.out.println("You were wounded in the attack!");
                YouAreWounded = true;
            }
        }
    }

    private static boolean ValidOpt (String action) {
        return action.equals("north") || action.equals("south") || action.equals("east") ||
                action.equals("west")  || action.equals("attack") || action.equals("sleep") || action.equals("escape")
                || action.equals("run");
    }

    private static void performAction (String move) {
        switch (move) {
            case "north":
                System.out.println("You are going north.");
                break;
            case "south":
                System.out.println("You are going south.");
                break;
            case "east":
                System.out.println("You are going east.");
                break;
            case "west":
                System.out.println("You are going west.");
                break;
            case "attack":
                System.out.println("You are going attack.");
                break;
            default:
                System.out.println("You do " + move + ".");
                break;

        }
    }

}