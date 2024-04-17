package Com;

import java.util.Random;
import java.util.Scanner;

public class Payment implements PaymentInterface {
    User ref = new User();
    int total = 0;
    public void paymentsOption() {
        System.out.println("**************************************************************************************************************");
        System.out.println("                                        Welcome to Payment detail Section ");
        System.out.println("                               **************************************************");
        System.out.println("   ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 To Check Membership Charges ");
        System.out.println("Press 2 to go Back To Main Menu ");

        int userInput = sc.nextInt();
        sc.nextLine();

        switch (userInput) {

            case 1 :
                membershipDetails();
                break;
            case 2 :
                ref.userMenu();
                break;

            default :
                System.err.println("YOU HAVE ENTER WRONG INPUT ");
                break;
        }
    }

    public void membershipDetails(){
        System.out.println("********************************************************************************************");
        System.out.println("                                     Welcome to Membership Details ");
        System.out.println("                              ********************************************");
        System.out.println("  ");
        System.out.println("Press 1  For  1  Month 400 Rs  ");
        System.out.println("Press 2  For 3 Month 1100 Rs ");
        System.out.println("Press 3  For 6 Month 2200 Rs ");
        System.out.println("Press 4  To go Back to Payment Option");
        System.out.println("NOTE THAT EXTRA CHARGE FOR LOCKER FACILITY 50 RS PER MONTH.");

        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        switch (userInput){
            case 1:
                 total = 400;
                 upi();
                break;
            case 2:
                total = 1100;
                upi();
                break;
            case 3:
                total = 2200;
                upi();
                break;
            default:

        }

    }


    public void otp(){
        Scanner sc = new Scanner(System.in);
        Random num =  new Random();
        int otp = num.nextInt(9000) + 1000;

            System.out.println(otp);
            System.out.println("Enter the Otp");
            int userotp = sc.nextInt();



            sc.nextLine();

            if (otp == userotp){
                System.out.println("Payment of " + total  + "Rs  is Successfully Paid ");
            }
            else {
                System.err.println("Incorrect OTP. Please try again.");
                otp();
            }
    }


    @Override
     public void upi(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Your Total Amount is : " + total);
         System.out.println(" Enter the Contact number to make the Payment ");
         long contact = sc.nextLong();
         sc.nextLine();
         otp();

        System.out.println("Thanks You ");
        System.out.println("Press 1 To go to Main Menu ");
        System.out.println("Press 2 to Exit ");

        int userInput = sc.nextInt();
        sc.nextLine();

        switch (userInput)
        {
            case 1:
                 ref.userMenu();
                 break;
            case 2:
                System.out.println("Thank You For Visiting ....");
                System.exit(0);

            default:
                System.err.println("YOU HAVE ENTER WRONG INPUT ");
                upi();
                break;
        }

     }
}
