public class L3Q5 {
    public static void main(String[] args) {
        /**
         * 5) Today your credit card balance is $1000, and you plan to make equal
         * payments (except for the last payment) per month until you pay off all of
         * your debt (assuming you will not make additional purchases until you pay off
         * the debt) . If you pay $65 per month:
         * 
         * a) compute how many months it will take for you to finish all your debt.
         * b) compute how much you will pay on the last month.
         * c) print the results you find for a) and b)
         */

        int balance = 699;
        int monthlyPayment = 75;

        int months = balance / monthlyPayment;
        int lastMonth = balance % monthlyPayment;

        System.out.println("Paying off " + balance + " will take " + months + " and the last payment will be " + lastMonth);

    }
}