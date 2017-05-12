package io;

import java.util.Scanner;

/**
 * Created by renecortez on 5/12/17.
 */
public class moreMethodExercise {

    public static int getInteger(Scanner scan, int min, int max){
        System.out.println("Enter a number between " + min + " and " + max + ": ");
        int userInput = scan.nextInt();

        if (userInput >= min && userInput <= max) {
            System.out.println("You have selected " + userInput);
            return userInput;
        } else {
            System.out.println("Invalid number, try again");
            return getInteger(scan, min, max);
        }
    }

    public static long factorial(int n){
        if (n <= 1){
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String wantsToContinue;

        int min = 1;
        int max = 10;

        do {
            int numberFactorial = getInteger(scan, min, max);

            System.out.println("The factorial of " + numberFactorial + " is " + factorial(numberFactorial));
            System.out.println("Do you want to continue? (y/n)");
            wantsToContinue = scan.next();

        } while (wantsToContinue.equalsIgnoreCase("y"));
    }
}
