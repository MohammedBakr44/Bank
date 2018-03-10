public class Deposit {

    public Deposit(Object[] Customer, String input, int D) {

        if (input.equals(Customer[0])) {

            // Convert The Balance Value To a Number To Use It In Calculation

            int CBalance = (Integer.parseInt((String) Customer[2])) + (D);

        }

    }
}
