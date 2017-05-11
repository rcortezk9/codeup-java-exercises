package io;

import java.util.Scanner;

/**
 * Created by renecortez on 5/11/17.
 */

public class bob {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Talk to Bob");
        String message = input.nextLine();

        if(message.endsWith("?")){
            System.out.println("Sure.");
        } else if(message.trim().isEmpty()){
            System.out.println("Fine be that way!");
        } else if(message.endsWith("!")
                || (message.toUpperCase().equals(message) && !message.toLowerCase().equals(message))){
            System.out.println("Whoa, chill out!");
        } else {
            System.out.println("Whatever.");
        }

    }
}
