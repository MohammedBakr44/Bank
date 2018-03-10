import java.util.Scanner;

public class Fire {
    public static void main(String[] args) {

        // Customers List You Can Make A New Customer Easily By Type "Customers.MakeCustomer("Customer Name", "Customer ID", "Customer Balance", "Customer Order ex.6");

        Object[] Custs[] = {

                Customers.MakeCustomer("Wael", "ACC123", "1500", "300",  1),
                Customers.MakeCustomer("Aly", "ACC124", "20000", "-2000",2),
                Customers.MakeCustomer("Hesham", "ACC125", "120000", "10000",  3),
                Customers.MakeCustomer("Tamer", "ACC126", "400","-200" ,4),
                Customers.MakeCustomer("Farida", "ACC127", "3600", "-500", 5)

        };


        Scanner input = new Scanner(System.in);

        new work(input, Custs);

    }
}