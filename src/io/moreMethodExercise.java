package io;

import java.util.Scanner;

/**
 * Created by renecortez on 5/12/17.
 */
public class moreMethodExercise {

    public static long getInteger(Scanner scan, long min, long max){
        System.out.println("Enter a number between " + min + " and " + max + ": ");
        long userInput = scan.nextLong();

        if (userInput >= min && userInput <= max) {
            System.out.println("You have selected " + userInput);
            return userInput;
        } else {
            System.out.println("Invalid number, try again");
            return getInteger(scan, min, max);
        }
    }

    public static long factorial(long n){
        if (n == 1){
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String wantsToContinue;

        long min = 1;
        long max = 10;

        do {
            long numberFactorial = getInteger(scan, min, max);

            System.out.println(numberFactorial + "! = " + factorial(numberFactorial));
            System.out.println("Do you want to continue? (y/n)");
            wantsToContinue = scan.next();

        } while (wantsToContinue.equalsIgnoreCase("y"));
    }
}
