package io;

import java.util.Scanner;

/**
 * Created by renecortez on 5/10/17.
 */
public class ControlFlowExercises_io {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int squareNum;
        int cubeNum;
        String heading1 = "number";
        String heading2 = "square";
        String heading3 = "cubed";
        String line = "------";


        System.out.println("What number would you like to go up to?");
        num = input.nextInt();
        System.out.println("");
        System.out.println("Here is your table!");
        System.out.println("");
        System.out.printf("%-7s |", heading1);
        System.out.printf("%-7s |", heading2);
        System.out.printf("%-7s ", heading3);
        System.out.printf("\n%-7s |", line);
        System.out.printf("%-7s |", line);
        System.out.printf("%-7s ", line);

        for(int i = 1; i<=num; i++){
            squareNum = i * i;
            cubeNum = i*i*i;
            System.out.printf("\n%-7s |", i);
            System.out.printf("%-7s |", squareNum);
            System.out.printf("%-7s", cubeNum);
        }
    }
}
