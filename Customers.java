import java.util.*;

public class Customers {


    // Create ArrayLists To Be Addable

    static List<String> customersNames = new ArrayList<>();
    static List<String> customersIDs = new ArrayList<>();
    static List<String> customersBalances = new ArrayList<>();
    static List<String> lastTransactions = new ArrayList<>();

    // Initialize Vars For Get ID & Name & Balance

    static Object ID;
    static Object Name;
    static Object Balance;
    static Object last;


    public static Object[] MakeCustomer(String CN, String CID, String CB, String L, int CO) {

        customersNames.add(CN);
        customersIDs.add(CID);
        customersBalances.add(CB);
        lastTransactions.add(L);

        // Convert ArrayLists To Arrays To Work With It

         Object[] CNmod = customersNames.toArray();
         Object[] CIDmod = customersIDs.toArray();
         Object[] CBmod = customersBalances.toArray();
         Object[] CLast = lastTransactions.toArray();

            // Get The User Data By Subtract 1 From Customer Order To Make It Start From "0"

            ID =  CIDmod[CO-1];
            Name =  CNmod[CO-1];
            Balance =  CBmod[CO-1];
            last =  CLast[CO-1];

    // But It All Together In One Array

            Object[] AllData = {
                    ID,
                    Name,
                    Balance,
                    last
            };

            // Print The Customers Data

            System.out.println(
                    "[" +
                    "Customer ID = " + ID +
                    "," +
                    " Customer Name = " + Name +
                    "," +
                    " Customer Balance = " + Balance +
                    ","
                    + " Last Transaction = " + last +
                    "]");


        return AllData;
    }
    
}
