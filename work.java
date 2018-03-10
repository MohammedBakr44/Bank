import java.util.Scanner;

public class work {

    public work(Scanner input, Object[] Custs[]) {

         int lastTransaction;

        boolean C = true; // Initialize Vars For Control Loop
        boolean D = true; // Initialize Vars For Control Loop

        OUTER_LOOP:while (C) {

            int i = 0;

            int Balance = Integer.parseInt ( (String) Custs[i][2]);

            lastTransaction = 0; // Assign Zero As Value For LastTransaction To Start From Zero When Process Another Customer

            System.out.print("Enter Your ID: ");

            String ID = input.next();

            // The Login Method

            for (i = 0; i <= Custs.length - 1; i++) {

                if (ID.equals ( Custs[i][0] )) {

                    System.out.println ( "Welcome: " + Custs[i][1] );

                    System.out.println ( "Your ID: " + Custs[i][0] );

                    break;

                } else if ( i == Custs.length-1) {
                    System.out.println ("Enter Valid ID!");
                    C = true;
                    continue OUTER_LOOP;
                }
            }

            INNER_LOOP:while (D) { // The Inner Loop That Controls Options

                // Available Options

                System.out.println();
                System.out.println("A.Check Balance");
                System.out.println("B.Deposit");
                System.out.println("C.Withdraw");
                System.out.println("D.Previous Transaction");
                System.out.println("E.Exit");

                System.out.println("====================================");
                System.out.println("Enter An Option");
                System.out.println("====================================");

                String Option = input.next().toUpperCase();

                switch (Option) {

                    case "A": // Check Balance Option

                        for (i = 0; i < Custs.length; i++) {

                            if (ID.equals ( Custs[i][0])) {

                                new CheckBalance ( Custs[i], ID, lastTransaction );
                            }
                        }

                        D = true;

                        continue INNER_LOOP;

                    case "B": // Deposit Option

                        System.out.println("----------------------");
                        System.out.println("Enter Amount To Deposit");
                        System.out.println("----------------------");

                        int deposit = input.nextInt();

                        for (i = 0; i < Custs.length; i++) {

                            if (ID.equals ( Custs[i][0] )) {

                                new Deposit ( Custs[i], ID, deposit );

                            }
                        }

                        lastTransaction += deposit;

                        D = true;

                        continue INNER_LOOP;

                    case "C": // Withdraw Option

                        System.out.println("----------------------");
                        System.out.println("Enter Amount To Withdraw");
                        System.out.println("----------------------");

                        int withdraw = input.nextInt();

                        for (i = 0; i < Custs.length; i++) {

                            if (ID.equals (Custs[i][0])) {

                                if (withdraw <= (Integer.parseInt((String) Custs[i][2])) + lastTransaction) {

                                    lastTransaction -= withdraw;

                                    Balance = Balance - withdraw;

                                } else {

                                System.out.println ("You Can't Withdraw This Sum From Your Account");

                                continue INNER_LOOP;

                                }
                            }


                        }

                        continue INNER_LOOP;

                    case "D": // Last Transaction

                        if (lastTransaction > 0) {

                            System.out.println("Deposited : " + lastTransaction);

                        } else {
                            System.out.println ("Withdrawn : " + Math.abs (lastTransaction));
                        }

                        continue INNER_LOOP;

                    case "E": // Exit Option

                        System.out.println("****************************************************");
                        System.out.println("Thanks For Using Our Service");
                        System.out.println("Process Another Customer (Y/N)");
                        String choice = input.next().toUpperCase();

                        if (choice.equals("Y")) {
                            C = true;
                            continue OUTER_LOOP;
                        } else {
                            C = false;
                            D = false;
                            for (i = 0; i < Custs.length; i++) {

                                    new PrintFinalResult(Custs[i], ID, lastTransaction);
                            }
                            break OUTER_LOOP;
                        }

                    default:
                        System.out.println("Enter Right Choice");
                    }





                }

            }
        }
    }

