package Com;
import java.util.Scanner;

public class Main {

    static {
        System.out.println("                                                    **************************************************************************");
        System.out.println("                                                                  Welcome to Chattrapati Shivaji Maharaj Library");
        System.out.println("                                                             **********************************************************");
    }

    public static void main(String[] args) {

        // Object
        Library ref = new User(); // Upcasting
         User ref1 = (User) ref;  // Down casting
        Library admin = new Admin(); // Upcasting
        Admin admin1 = (Admin) admin; // Down casting
       admin1.assignBook();


        System.out.println("Enter 1 to Register");
        System.out.println("Enter 2 to  User Login");
        System.out.println("Enter 3 for Admin Login");
        System.out.println("Enter 4 for Exit");

        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Enter the Value: ");
        int val = sc.nextInt();

        // switch Condition
        switch(val){
            case 1 :
               ref.signUp();
            case 2:
                ref.login();
                ref1.userMenu();
                break;
            case 3 :
                admin1.adminLogin();
                break;
            case 4:
                System.out.println("THANK YOU");
                System.exit(0);
                break;
            default:
                System.err.println("Invalid Input Try Again.....");
             ref.signUp();
        }
    }
}