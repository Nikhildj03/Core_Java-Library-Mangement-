package Com;

import java.util.Scanner;

// User Class
  class User extends Library {



    // User Main Menu
    public void userMenu(){
        System.out.println("                             *****************************");
        System.out.println( "                                       USER MENU");
        System.out.println("                                  *********************");

        System.out.println("Enter 1 to see Your Details ");
        System.out.println("Enter 2 to Lends the Book");
        System.out.println("Enter 3 to Return the Book");
        System.out.println("Enter 4 for Membership Payment");
        System.out.println("Enter 5 to Exit");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Above Number: ");
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("User Details");
                userDetails();
                userMenu();
                break;
            case 2:
                System.out.println("Lends Book");
                bookSection();
                userMenu();
                break;
            case 3:
                System.out.println("Return The Book");
                returnBookUser();
                userMenu();
                break;
            case 4:
                Payment ref = new Payment();
                ref.paymentsOption();
                break;
            case 5:
                System.out.println("Exiting The Program Have A Good Day....");
                System.exit(0);
                break;
            default:
                System.err.println("Invalid Input");
                userMenu();
                break;
        }

    }

    // Display The User Details
    public void userDetails(){
        System.out.println("                                        USER DETAILS");
        System.out.println();
        System.out.println("********************************************************************************************");
        System.out.println( "        User Details are: ");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getIdNo());
        System.out.println("Password: " + getPassword());
        System.out.println("Contact no: " + getContactno());
        System.out.println("Email id: " + email);
        System.out.println("Address: " + address);
        System.out.println("****************************************************************************************");
        Scanner sc = new Scanner(System.in);
        System.out.println("If You want to change any Details then  Press 1 ");
        System.out.println("If Not then  Press 2 for User Menu ");
        int userIn = sc.nextInt();
        switch (userIn){
            case 1 :
                signUp();
                break;
            case 2:
                userMenu();
                break;
            default:
                System.err.println("You have Enter Wrong Input Please Try Again");
                userDetails();
        }

    }

    // Lending the Book
    public void lendingBookFiction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Book Id for Lending the Book");
        int userInput = sc.nextInt();
        sc.nextLine();
        boolean bookFound = false;

        for (Book cart : fiction) {
            if (cart.getId()  == userInput) {
                userCart.add(cart);
                System.out.println("Book Added to Cart Succesully");
                bookFound = true;
                 displayUserCart();
                break;
            }
        }
        if (!bookFound) {
            System.out.println("Book not found in the fiction collection.");
        }
    }



    // Lending the Book
    public void lendingBookNonFiction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Book Id for Lending the Book");
        int userInput = sc.nextInt();
        sc.nextLine();
        boolean bookFound = false;

        for (Book cart : nonFiction) {
            if (cart.getId() == userInput) {
                userCart.add(cart);
                System.out.println("Book Added to Cart Succesully");
                bookFound = true;
                displayUserCart();
                break;
            }
        }
        if (!bookFound) {
            System.out.println("Book not found in the fiction collection.");
        }
    }



    // Lending the Book
    public void lendingBookAcademic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Book Id for Lending the Book");
        int userInput = sc.nextInt();
        sc.nextLine();
        boolean bookFound = false;

        for (Book cart : academic) {
            if (cart.getId() == userInput) {
                userCart.add(cart);
                System.out.println("Book Added to Cart Succesully");
                bookFound = true;
                displayUserCart();
                break;
            }
        }
        if (!bookFound) {
            System.out.println("Book not found in the fiction collection.");
        }
    }


        // Lending the Book
        public void lendingBookChildren() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Book Id for Lending the Book");
            int userInput = sc.nextInt();
            sc.nextLine();
            boolean bookFound = false;

            for (Book cart : childrenBook) {
                if (cart.getId() == userInput) {
                    userCart.add(cart);
                    System.out.println("Book Added to Cart Succesully");
                    bookFound = true;
                    displayUserCart();
                    break;
                }
            }
            if (!bookFound) {
                System.out.println("Book not found in the fiction collection.");
            }

        }


    // Lending the Book
    public void lendingOtherBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Book Id for Lending the Book");
        int userInput = sc.nextInt();
        sc.nextLine();
        boolean bookFound = false;

        for (Book cart : otherBook) {
            if (cart.getId() == userInput) {
                userCart.add(cart);
                System.out.println("Book Added to Cart Succesully");
                bookFound = true;
                displayUserCart();
                break;
            }
        }
        if (!bookFound) {
            System.out.println("Book not found in the fiction collection.");
        }

    }




    // Displaying the Usercart
        public void displayUserCart(){
            System.out.println("Enter 1 to Check Out ");
            System.out.println("Enter 2 to Continue");
            System.out.println("Enter 3 to Check Your Cart");
          Scanner sc = new Scanner(System.in);
          int userInput = sc.nextInt();
          sc.nextLine();

          switch (userInput){

              case 1 :
                  System.out.println(userCart);
                  System.out.println("Thank You For Visiting.....");
                  break;

              case 2 :
                  userMenu();
                      break;
              case 3 :
                  System.out.println("**********************************************************************************");
                  for(Object obj : userCart){
                      System.out.println(obj);
                  }
                  System.out.println("***********************************************************************************");
                  userMenu();

              default:
                  System.err.println("You Have Enter Wrong Input Please Try Again...");
                  break;
          }

        }

        // Return The book
    public void returnBookUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("*************************************************************************************************");
        System.out.println("                                                          RETURING THE BOOK  ");
        System.out.println("Enter Book Details:");
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Title: ");
        String title = sc.nextLine();
        System.out.print("Author: ");
        String author = sc.nextLine();

        // Create a new Book object with the entered details
        Book newBook1 = new Book( title, id ,  author);

        // Add the new book to the ArrayList
        cart.add(newBook1);

        System.out.println("Book Returned successfully.....");
    }

    }




