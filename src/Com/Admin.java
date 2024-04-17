package Com;

import java.util.Scanner;

 class Admin extends Library {

     // Admin Var
     int adminId  = 101;
     String adminPassword = "123";

    int numberOfBooks;
   Book obj = new Book();
boolean notRepeated = true;

   // assigning the Books Details To Avoid Duplicating the adding
     public void assignBook(){
      if (notRepeated == true) {
             // Adding the Books details
             obj.fictionMistry();
             obj.romanceSection();
             obj.scienceSection();
             obj.biographySection();
             obj.autobiographySection();
             obj.selfHelpSection();
             obj.bcomSection();
             obj.engineeringSection();
             obj.bscSection();
             obj.pictureSection();
             obj.youngBookSec();
             obj.middleGradeNovels();
             obj.poetrySection();
             obj.comicsSection();
             obj.playSection();
             notRepeated = false;
         } else {
             fiction.removeAll(fiction);
             notRepeated = true;
             assignBook();
         }
     }


    public void bookDetails() {

         // Checking the Value
             assignBook();

        Scanner sc = new Scanner(System.in);
        System.out.println("         ================================================================");
        System.out.println("                                    Books Details ");
        System.out.println("Select 1 For Fiction Section");
        System.out.println("Select 2 For  Non-Fiction Sections");
        System.out.println("Select 3 For Academic Section");
        System.out.println("Select 4 For Children Section ");
        System.out.println("Select 5 For Other Section ");
        System.out.println("Select 6 For Newly Added Book");
        System.out.println("Select 7 to go Back ");
        int input = sc.nextInt();
        sc.nextLine();
        switch (input)
        {
            case 1 :
               fictionsDetails();
                break;
            case 2 :
                nonFictionDetails();
                break;
            case 3 :
                academicDetails();
                break;
            case 4 :
                childrenBookDetails();
                break;
            case 5 :
                otherBooksDetails();
                break;
            case 6 :
                obj.newlyAddedBook();
                break;

            case  7 :
                adminMenu();
                break;

            default:
                System.err.println("           You Have Enter Wrong Input Try Again... ");
                bookDetails();
                break;

        }
    }



    // Fiction Details
    public void fictionsDetails(){
         Scanner sc = new Scanner(System.in);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("                                            Welcome to Fiction Details");
        System.out.println("Enter 1 For Mistry Books");
        System.out.println("Enter 2 For Romance Books");
        System.out.println("Enter 3 For Science Books ");
        System.out.println("Enter 4  To Go Back ");

        int input = sc.nextInt();
        sc.nextLine();
        switch (input) {
            case 1:
                obj.fictionMistryDetails();
                return;
            case 2:
                obj.romanceDetails();
                return;
            case 3:
                obj.scienceDetails();
                return;
            case 4:
                bookDetails();
                return;
            default:
                System.err.println("Wrong Input Please Try again");
                fictionsDetails();

        }


    }


    // Non-Fictions Details
     public void nonFictionDetails() {
         Scanner sc = new Scanner(System.in);
         System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
         System.out.println("                                                   Welcome to Non-Fiction Details");
         System.out.println("Enter 1 For Biography Books");
         System.out.println("Enter 2 For AutoBiography Books");
         System.out.println("Enter 3 For Self Helps Books ");
         System.out.println("Enter 4  To Go Back ");

         int input = sc.nextInt();
         sc.nextLine();
         switch (input) {
             case 1:
                 obj.biographyDetails();
                 return;
             case 2:
                 obj.autobiographyDetails();
                 return;
             case 3:
                 obj.selfHelpDetails();
                 return;
             case 4:
                 bookDetails();
                 return;
             default:
                 System.err.println("Wrong Input Please Try again");
                 nonFictionDetails();

         }
     }

     // Academic Details
     public void academicDetails() {

         Scanner sc = new Scanner(System.in);
         System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
         System.out.println("                                                              Welcome to Academic Details");
         System.out.println("Enter 1 For B.Com Books");
         System.out.println("Enter 2 For Engineering Books");
         System.out.println("Enter 3 For B.Sc Books ");
         System.out.println("Enter 4  To Go Back ");

         int input = sc.nextInt();
         sc.nextLine();
         switch (input) {
             case 1:
                 obj.bcomSectionDetails();
                 return;
             case 2:
                 obj.engsectionDetails();
                 return;
             case 3:
                 obj.bscSectionDetails();
                 return;
             case 4:
                 bookDetails();
                 return;
             default:
                 System.err.println("Wrong Input Please Try again");
                 academicDetails();

         }
     }

     // Children Books Details
   public void childrenBookDetails(){
       Scanner sc = new Scanner(System.in);
       System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
       System.out.println("                                                          Welcome to Children Books Details");
       System.out.println("Enter 1 For  Picture  Books");
       System.out.println("Enter 2 For  Young  Books");
       System.out.println("Enter 3 For Middle Grade Novels Books ");
       System.out.println("Enter 4  To Back ");

       int input  = sc.nextInt();
       sc.nextLine();
       switch (input) {
           case 1:
               obj.pictureSectionDetails();
               return;
           case 2:
             obj.youngsectionDetails();
               return;
           case 3:
             obj.middleGradeNovelDetails();
               return;
           case 4:
               bookDetails();
               return;
           default:
               System.err.println("Wrong Input Please Try again");
               childrenBookDetails();
       }
       }

       // Other Books Details
     public void otherBooksDetails(){
         Scanner sc = new Scanner(System.in);
         System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
         System.out.println("                                                   Welcome to Other Books Details");
         System.out.println("Enter 1 For Poetry Books");
         System.out.println("Enter 2 For Comics Books");
         System.out.println("Enter 3 For Plays Books ");
         System.out.println("Enter 4  To Back ");

         int input  = sc.nextInt();
         sc.nextLine();
         switch (input) {
             case 1:
              obj.poetrySectionDetails();
                 return;
             case 2:
                obj.comicsPlaysDetails();
                 return;
             case 3:
                obj.playSectionDetails();
                 return;
             case 4:
                 bookDetails();
                 return;
             default:
                 System.err.println("Wrong Input Please Try again");
            otherBooksDetails();
         }
         }


         // To adding the Book
    public void addBookDetails() {
        System.out.println("        ************************************************************");
        System.out.println("                                          ADDING BOOKS");
        System.out.println(" ");
        System.out.println("Enter the given no where you have to add the Book ");
        System.out.println("Select 1 For Fiction Section");
        System.out.println("Select 2 For  Non-Fiction Sections");
        System.out.println("Select 3 For Academic Section");
        System.out.println("Select 4 For Children Section ");
        System.out.println("Select 5 For Other Section ");
        System.out.println("Select 6 to go Back ");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        switch (input){
            case 1 :
                System.out.println("Fiction Section");
                booksAddingDetailsFiction();
                break;
            case 2 :
                System.out.println("Non_fiction");
                booksAddingDetailsNonFiction();
                break;
            case 3 :
                System.out.println("Academic Section");
                booksAddingDetailsAcademic();
                break;
            case 4 :
                System.out.println("Children");
                booksAddingDetailsChildren();
                break;
            case 5 :
                System.out.println("Other Section");
                booksAddingDetailsOtherSection();
                break;
            case 6 :
                break;

            default:
                System.err.println("YOU HAVE ENTER WRONG INPUT PLEASE ENTER VALID INPUT");
        }
    }



    public void booksAddingDetailsFiction(){
         Scanner sc = new Scanner(System.in);
        System.out.println("*********************************");
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

        System.out.println("Book added successfully.");

    }

    public void booksAddingDetailsNonFiction(){
        Scanner sc = new Scanner(System.in);
        System.out.println("*********************************");
        System.out.println("Enter Book Details:");
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Title: ");
        String title = sc.nextLine();
        System.out.print("Author: ");
        String author = sc.nextLine();

        // Create a new Book object with the entered details
        Book newBook2 = new Book( title, id ,  author);

        // Add the new book to the ArrayList
        cart.add(newBook2);

        System.out.println("Book added successfully.");

    }

    public void booksAddingDetailsAcademic(){
        Scanner sc = new Scanner(System.in);
        System.out.println("*********************************");
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

        System.out.println("Book added successfully.");

    }

    public void booksAddingDetailsChildren(){
        Scanner sc = new Scanner(System.in);
        System.out.println("*********************************");
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

        System.out.println("Book added successfully.");

    }

    public void booksAddingDetailsOtherSection(){
        Scanner sc = new Scanner(System.in);
        System.out.println("*********************************");
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

        System.out.println("Book added successfully.");

    }

   public void removeBook(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Book Id to Remove from Cart: ");
       int userInput = sc.nextInt();
       sc.nextLine(); // Consume newline

       boolean bookFound = false;

// Iterate through user's cart
       for (Book book : cart) {
           if (book.getId() == userInput) {
               cart.remove(book); // Remove the book
               System.out.println("Book removed from cart successfully.");
               bookFound = true;
               break;
           }
       }
       if (!bookFound) {
           System.out.println("      ****************************************************************************************************");
           System.err.println(                               "Book with ID " + userInput + " not found in the cart.");
       }

   }

    public void adminLogin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("                                                                             ADMIN LOGIN");
        System.out.println("                                   *************************************************************************************************");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Your Password");
        String pass = sc.nextLine();
        if (id == this.adminId && pass.equals(this.adminPassword)) {
            System.out.println("                         Login Successfully BOSS....");
            adminMenu();
        } else {
            System.err.println("Incorrect Id OR Password BOSS Please Try again....");
            adminLogin();
        }
    }

    public void adminMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("                                                                             ADMIN MENU ");
        System.out.println("                                   *************************************************************************************************");
        System.out.println("Enter Your id");
        System.out.println("Press 1 to Add the Book");
        System.out.println("Press 2 to Display the Book");
        System.out.println("Press 3 to Remove the Book");
        System.out.println("Press 4 to Exit");

        int n = sc.nextInt();
        switch (n) {
            case 1:
               addBookDetails();
                adminMenu();
                break;
            case 2:
                bookDetails();
               adminMenu();
                break;
            case 3:
                System.out.println("Remove A book");
                removeBook();
                adminMenu();
                break;
            case 4:
                System.out.println("Thanks BYE BYE.....");
                System.exit(0);
                break;
            default:
                System.err.println("Please Enter the Given Value Only");
                adminMenu();
                break;
        }
    }
 }


