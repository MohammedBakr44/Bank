import com.sun.xml.internal.bind.v2.model.core.ID;

public class PrintFinalResult {

    public PrintFinalResult(Object[] Customer, String ID, int last) {

        int CBalance;

        if (ID.equals ( Customer[0] )) {

            CBalance = (Integer.parseInt ( (String) Customer[2] )) + last;

        } else {

            CBalance = (Integer.parseInt ( (String) Customer[2] ));

            last = Integer.parseInt ( (String) Customer[3]);
        }


        System.out.println("[" +
                            "Customer ID = " + Customer[0] +
                            "," +
                            " Customer Name = " + Customer[1] +
                            "," +
                            " Customer Balance = " + CBalance +
                            ", " +
                             " Last Transaction = " + last
                            + "]");

        }
}
