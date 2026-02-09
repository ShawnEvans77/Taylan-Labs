public class L1Q6 {
    public static void main(String[] args) {
        /**
         * 6) (Average speed in miles) Assume that a runner runs 14 kilometers in 45
         * minutes and 30 seconds. Write a program that displays the average speed in
         * miles per hour. (Note 1 mile is equal to 1.6 kilometers.)
         */

        int kilometers = 14;
        double minutes = 45.5;
        double miles = kilometers / 1.6;
        double hour = minutes / 60;
        double mpH = miles / hour;

        System.out.println(mpH); // ~11.5
    }
}