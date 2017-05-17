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

    public int getInt(){
        return scanner.nextInt();
    }

    public int getInt(int min, int max){
        int userInput = this.getInt();

        if(userInput >= min && userInput <= max){
            return userInput;
        } else {
            System.out.println(userInput + " Invalid number, try again");
            return getInt(min, max);
        }
    }


    public double getDouble (double min, double max){
        double decimalNum = scanner.nextDouble();

        if(decimalNum >= min && decimalNum <= max){
            return decimalNum;
        } else {
            System.out.println(decimalNum + " Invalid number, try again");
            return getDouble(min, max);
        }
    }

    public double getDouble(){
        return scanner.nextDouble();
    }
}
