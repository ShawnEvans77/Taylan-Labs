import java.util.Scanner;
public class L3Q4 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter m and r: ");

        int m = keyboard.nextInt();
        int r = keyboard.nextInt();

        double answer = m * (r*r);
        double solution = m * Math.pow(r, 2);

        keyboard.close();
        
    }
    
}
