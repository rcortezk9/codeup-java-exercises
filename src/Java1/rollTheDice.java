package Java1;

import java.util.Scanner;
import java.util.Random;

/**
 * Created by renecortez on 5/12/17.
 */
public class rollTheDice {

    public static void main(String[] args) {
        Random dice = new Random();
        Scanner input = new Scanner(System.in);
        int sides;
        int die1;
        int die2;
        String wantsToContinue;

        do {
            System.out.println("How many sides does the dice have?");
            sides = input.nextInt();
            die2 = dice.nextInt(sides) + 1;
            die1 = dice.nextInt(sides) + 1;
            System.out.println("You rolled a " + die1 + " and " + die2);
            System.out.println("Do you want to continue? (y/n)");
            wantsToContinue = input.next();
        } while (wantsToContinue.equalsIgnoreCase("y"));
    }


}
