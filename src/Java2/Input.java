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
            return Integer.valueOf(this.getString());
        } catch (NumberFormatException e) {
            System.out.println("That's not an integer! Try again!");
            return getInt();
        }
    }
    public int getInt(int min, int max) {
        if (min <= Integer.valueOf(this.getString()) && max >= Integer.valueOf(this.getString())) {
            return Integer.valueOf(this.getString());
        } else {
            System.out.println("That number doesn't fall within the range, enter one between " + min + " and " + max);
            getInt(min, max);
            return 0;
        }
    }


    public double getDouble(double min, double max) {
        try {
            if (min <= Double.valueOf(this.getString()) && max >= Double.valueOf(this.getString())) {
                return Double.valueOf(this.getString());
            } else {
                System.out.println("That number doesn't fall within the range, enter one between " + min + " and " + max);
                return getDouble(min, max);
            }
        } catch (NumberFormatException e) {
            System.out.println("That is not an integer! Try again.");
            return getDouble(min, max);
        }
    }


    public double getDouble() {
        try {
            return Double.valueOf(this.getString());
        } catch (NumberFormatException e) {
            System.out.println("That's not a double! Try again.");
            return getDouble();
        }
    }

}
