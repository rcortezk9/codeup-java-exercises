package Java2;

import java.util.Scanner;

/**
 * Created by renecortez on 5/17/17.
 */
public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        return scanner.nextLine();

    }

    public boolean yesNo(){
        String answer = this.getString();//because you have a functions already
        if(answer.equalsIgnoreCase("y")){
            System.out.println("On");
            return true;
        } else {
            System.out.println("Off");
            return false;
        }
    }

    public int getInt() {
        try {
            String validatingInput = this.scanner.nextLine();
            return Integer.valueOf(validatingInput);
        } catch (NumberFormatException e) {
            System.out.println("That's not an integer! Try again!");
            getInt();
            return 0;
        }
    }


    public double getDouble(double min, double max) {
        try {
            String validatingInput = this.scanner.nextLine();
            if (min <= Double.valueOf(validatingInput) && max >= Double.valueOf(validatingInput)) {
                return Double.valueOf(validatingInput);
            } else {
                System.out.println("That number doesn't fall within the range, enter one between " + min + " and " + max);
                getDouble(min, max);
                return 0;
            }
        } catch (NumberFormatException e) {
            System.out.println("That is not an integer! Try again.");
            getDouble(min, max);
            return 0;
        }
    }


    public double getDouble() {
        try {
            String validatingInput = this.scanner.nextLine();
            return Double.valueOf(validatingInput);
        } catch (NumberFormatException e) {
            System.out.println("That's not a double! Try again.");
            getDouble();
            return 0;
        }
    }

}
