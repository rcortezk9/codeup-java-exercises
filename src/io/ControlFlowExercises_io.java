package io;

import java.util.Scanner;

/**
 * Created by renecortez on 5/10/17.
 */
public class ControlFlowExercises_io {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("What number would you like to go up to? ");
        num = input.nextInt();
        System.out.println("Here is your table");
        System.out.println("number | square | cubed");
        System.out.println("------ | ------ | -----");

        for(int i = 1; i<=num; i++){
            System.out.println(i + "      | " + (i*=i) + "       | ");
        }
    }
}
