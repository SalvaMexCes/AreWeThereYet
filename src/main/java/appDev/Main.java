package appDev;

import java.util.Scanner;

public class Main{

    //Create a method that accepts one parameter(A  user's input)
    //The method's job is to continuously ask a user "Are we there yet? " until the user's input entered is Yes.
    //If user's input is anything but YES then your method MUST keep asking the user the question: "Are we there yet?"

    public static void main(String[] args) {
        areWeThereYet(args);
    }

    public static void areWeThereYet(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Are we there yet?");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("Yes")) {
                System.out.println("Okay");
                break;
            } else {
            }
        } while (true);
        scanner.close();
    }
}
