public class Login {

   public Login(Object[] Customer, String ID) {

       if (ID.equals(Customer[0])) {

           System.out.println("Welcome: " + Customer[1]);

           System.out.println("Your ID: " + Customer[0]);

       }
   }

}
