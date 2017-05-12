package io;

import java.util.Scanner;

/**
 * Created by renecortez on 5/11/17.
 */
public class methodExercise {

    public static double add(double x, double y) {return x + y;}

    public static double subtract(double x, double y){
        return x - y;
    }

    public static double multiply(double x, double y){
        return x * y;
    }

    public static double divide(double x, double y){
        return x/y;
    }

    public static double modulus(double x, double y){
        return x % y;
    }

    public static int getInteger(int min, int max){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max + ": ");
        int userInput = scan.nextInt();

        if(userInput >= min && userInput <= max){
            return userInput;
        } else {
            System.out.println("Invalid number, try again");
            return getInteger(min, max);
        }
    }


    public static void main(String[] args) {
        int min = 1;
        int max = 10;
        int num1 = getInteger(min, max);
        int num2 = getInteger(min, max);

        System.out.println(add(num1,num2));
        System.out.println(subtract(num1, num2));
        System.out.println(multiply(num1, num2));
        System.out.println(divide(num1,num2));
        System.out.println(modulus(num1, num2));

    }


}
