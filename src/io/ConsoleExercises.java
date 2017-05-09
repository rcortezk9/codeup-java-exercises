package io;

import java.util.Scanner;


/**
 * Created by renecortez on 5/8/17.
 */
public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int age;

//        System.out.println("What is your age?");
//        age = sc.nextInt();
//        System.out.println("Your age is: " + age);

//        System.out.println("What are 3 of your favorite colors?");
//        String firstColor = sc.nextLine();
//        String secondColor = sc.nextLine();
//        String thirdColor = sc.nextLine();
//        System.out.println("Your first color is: " + firstColor);
//        System.out.println("Your second color is: " + secondColor);
//        System.out.println("Your third color is: " + thirdColor);

//        System.out.println("What did you do yesterday");
//        String yesterday = sc.nextLine();
//        System.out.println("You entered: " + yesterday);


        System.out.println("Enter the length of the room?");
        String length = sc.nextLine();
        System.out.println("Enter the width of the room?");
        String width = sc.nextLine();
        System.out.println("Enter the height of the room?");
        String height = sc.nextLine();

        double lenghtResult = Double.parseDouble(length);
        double widthResult = Double.parseDouble(width);
        double heightResult = Double.parseDouble(height);

        double area = lenghtResult * widthResult;
        double perimeter = 2*lenghtResult + 2*widthResult;
        double volume = lenghtResult*widthResult*heightResult;

        System.out.printf("The area is %.2f\n", area);
        System.out.printf("The perimeter is %2f\n", perimeter);
        System.out.printf("The volume of the room is %.2f\n", volume);


    }
}
