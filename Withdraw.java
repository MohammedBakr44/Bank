public class Withdraw {

    public Withdraw(Object[] Customer, String input, int W) {

        if (input.equals(Customer[0])) {

            // Convert The Balance Value To a Number To Use It In Calculation

            int userBalance = Integer.parseInt((String) Customer[2]);

            if (W < userBalance) {

                userBalance = W - userBalance;

            }

        }
    }
}
