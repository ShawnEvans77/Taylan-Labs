import java.util.Scanner;
public class L2Q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the width = ");
        double width = sc.nextDouble();

        System.out.print("Enter the height = ");
        double height = sc.nextDouble();

        System.out.println("The perimeter of a rectangle with a width of " + width + " and height " + height + " is equal to: " + (2 * (width + height)));

        sc.close();
    }
    
}
