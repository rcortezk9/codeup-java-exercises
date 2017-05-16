package Java1;

import java.util.Scanner;

/**
 * Created by renecortez on 5/10/17.
 */
public class ControlFlowExercises_io {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String wantsToContinue;

        do {
            System.out.println("What number would you like to go up to?");
            int num = input.nextInt();

            System.out.println("Here is your table!");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");

            for (int i = 1; i <= num; i++) {
// padding note: when using %s you'll have the not use spaces
                System.out.printf("%-7d| %-8s| %d%n", i, i * i, i * i * i);
            }
            System.out.println("Do you want to continue? (y/n)");
            wantsToContinue = input.next();//has to be .next()
        } while(wantsToContinue.equalsIgnoreCase("y"));
    }
}
