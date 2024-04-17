package Com;

import java.util.*;



abstract class Library  {
//    Non-static Var
        private String name;
         private int idNo ;
       private String password ;
       private String contactno ;
        String email ;
        String address;
        boolean isSignUp = false;

        // Getter Setter For Id
     public int getIdNo() {
         return idNo;
     }

     public void setIdNo(int idNo) {
         this.idNo = idNo;
     }

     // Getter setter for UserName
     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     // Getter Setter For Contact No
     public String getContactno() {
         return contactno;
     }

     public void setContactno(String contactno) {
         this.contactno = contactno;
     }

     // Getter Setter For Password
     public void setPassword(String password) {
         this.password = password;
     }

     public String getPassword() {
         return password;
     }

     // Object
    static  Book ref = new Book();

        // Cart
        static List<Book> cart = new ArrayList<Book>() ;
        static List<Book> fiction = new ArrayList<>();
        static List<Book> nonFiction = new ArrayList<>();
        static List<Book> academic = new ArrayList<>();
        static List<Book> childrenBook = new ArrayList<>();
        static List<Book> otherBook = new ArrayList<>();
        static List<Book> userCart = new ArrayList<>();


        // SignUp
        public void signUp() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Name");
            setName(sc.nextLine());
            System.out.println("Enter Your Id");
            setIdNo(sc.nextInt());
            sc.nextLine();
            passwordValidator();
            contactValidator();
            System.out.println("Enter Your address");
            address = sc.nextLine();
            System.out.println("Enter Your Email");
            email = sc.nextLine();
            isSignUp= true;
        }

        // Login
        public void login() {


            if(isSignUp == true){
                Scanner sc = new Scanner(System.in);
                System.out.println("************************************************************************************");
                System.out.println("                                           LOGIN PAGE");
                System.out.println("Press 1 to Login with contact");
                System.out.println("Press 2 to Login with id");
                int n = sc.nextInt();
                sc.nextLine();
                switch (n) {
                    case 1:
                        loginWithContact(sc);
                        break;
                    case 2:
                        loginWithId(sc);
                        break;
                    default:
                        System.err.println("Invalid Input Try Again!!!");
                        login();
             }
            }
            else {
                System.err.println("Sign in Is Complusory");
                signUp();
                login();
            }
        }

        // Login with Contact
        private void loginWithContact(Scanner sc) {
            System.out.println("===========================================================================================");
            System.out.println("                                                 LOGIN WITH CONTACT NO");
            System.out.println("Enter Your Contact no");
            String contactno = sc.nextLine();
            if (contactno.equals(this.getContactno())){
                System.out.println("Contact Number Is Valid ");
                System.out.println("Enter Your Password ");
                String password = sc.nextLine();
                if (password.equals(this.password)){
                    System.out.println("Login Successful");
                } else {
                    System.err.println("PASSWORD IS INVALID!!!");
                    login();
                }
            } else {
                System.err.println("Contact is Invalid OR Password is Invalid");
                login();
            }
        }

        // login With ID
        private void loginWithId(Scanner sc) {
            System.out.println("========================================================================================");
            System.out.println("                                                 LOGIN WITH ID");

            System.out.println("Enter the id");
            int id = sc.nextInt();
            if (id == this.idNo) {
                sc.nextLine(); // Consume newline
                System.out.println("Enter Your Password");
                String password = sc.nextLine();
                if (password.equals(this.password)) {
                    System.out.println("Login Successfully ");
                } else {
                    System.err.println("Invalid password Try Again");
                    login();
                }
            } else {
                System.err.println("Id is Invalid");
                login();
            }
        }

        // Password Checker
        public void passwordValidator() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Password");
            password = sc.nextLine();
            System.out.println("Enter the Confirm Password");
            String cPassword = sc.nextLine();
            if (!password.equals(cPassword)) {
                System.err.println("Password is not Matching Enter the Correct password or try Again!!!");
                passwordValidator();
            }
        }

        // Contact Validator
        public void contactValidator() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the contact number");
            contactno = sc.nextLine();
            if (contactno.length() != 10) {
                System.err.println("Contact is Invalid");
                contactValidator();
            }
        }

        // For Book Sections
    public  void bookSection(){
        System.out.println("********************************************************************************************");
        System.out.println("                                        WELCOME TO BOOK SECTION ");
        System.out.println("select 1 for Fiction Related Books");
        System.out.println("select 2 for Non-Fiction Related Books");
        System.out.println("select 3 for Academic Books");
        System.out.println("select 4 for Children Books");
        System.out.println("select 5 for Other Categories");
        System.out.println("select 6 to go Back");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.nextLine();

        // Condition
        switch (input){
            case 1 :
                System.out.println("Fiction");
                ref.fiction();
                break;
            case 2 :
                System.out.println("Non-Fiction");
                ref.nonFiction();
                break;
            case 3 :
                System.out.println("Academic");
                ref.academic();
                break;
            case 4 :
                System.out.println("Children's Books");
                ref.childrenBook();
                break;
            case 5 :
                System.out.println("Other Categories ");
                ref.otherCatergory();
                break;
            case 6 :
                System.out.println("Thank U");
                User u9 = new User();
                u9.userMenu();
                break;
        }


      }

    }


