public class CheckBalance {

    public CheckBalance(Object[] Customer, String input, int last) {

        if (input.equals(Customer[0])) {

            int CBalance = (Integer.parseInt((String) Customer[2])) + (last);

            System.out.println("Your Balance Is: " + CBalance);
        }
    }

}