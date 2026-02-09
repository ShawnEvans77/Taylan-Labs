import java.util.Scanner;
public class L3Q4 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter m and r: ");

        int m = keyboard.nextInt();
        int r = keyboard.nextInt();

        double answer = m * (r*r);
        
        System.out.println(answer);

        keyboard.close();
        
    }
    
}
