// SCANNER - lets us get input from the keyboard

import java.util.Scanner; // imports the scanner. first step.
public class L3Q6 {
    public static void main(String[] args) {

        // create the scanner to use int
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the time in seconds: ");

        int seconds = keyboard.nextInt();

        int hours = seconds / 3600;
        int remainingMinutes = seconds % 3600;

        int minutes = remainingMinutes / 60;
        int remainingSeconds = remainingMinutes % 60;

        System.out.println(seconds + " seconds equals " + hours + " hours " + minutes + " minutes " + remainingSeconds + " seconds.");

        keyboard.close();
    }
}