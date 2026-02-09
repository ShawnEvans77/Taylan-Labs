import java.util.Scanner;
public class L2Q7 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the width: ");

        double width = keyboard.nextDouble();

        System.out.print("Enter the height: ");

        double height = keyboard.nextDouble();

        double perimeter = 2 * (width+height);

        System.out.println("Perimeter of a rectangle with width " + width + " and height  " + height + " is equal to " + perimeter);

        keyboard.close();
    }
    
}
