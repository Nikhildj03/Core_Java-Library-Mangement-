package Com;

import java.util.Scanner;

// Class Book
class Book extends Library {
    // Books Non-static Var
    String booksTittle;
    int booksId;
    String authorName;

     // Constructor
     public Book() {
         super();
     }

     User user = new User();


    // Constructor
    public Book(String booksTittle, int booksId, String authorName ) {
        this.booksTittle = booksTittle;
        this.booksId = booksId;
        this.authorName = authorName;

    }



    @Override
    public String toString(){
        return    " Book Id : " + booksId + "  , Book Name :   " + booksTittle + ", Author Name : - " + authorName ;
    }



     // Fiction Section

    public  void fiction(){
      System.out.println("=====================================================================================================");
        System.out.println("                                                               WELCOME TO FICTION SECTION");
      System.out.println("=====================================================================================================");

      System.out.println("select 1 for Fiction Mistry Books");
        System.out.println("select 2 for Romance Books");
        System.out.println("select 3 for Science Books");
        System.out.println("select 4 to go Back");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
         scanner.nextLine();
        switch (input){
            case 1:
                System.out.println("Fiction Mistry");
                fictionMistryDetails();
                user.lendingBookFiction();
                break;

            case 2:
                System.out.println("Romance Books");
                romanceDetails();
                user.lendingBookFiction();
                break;

            case 3:
                System.out.println("Science Books");
                scienceDetails();
                user.lendingBookFiction();
                break;

            case 4:
                System.out.println("To Go Back ");
                bookSection();
                break;
        }

    }



    //  Adding the Fiction Books
    public void fictionMistry(){

        // Adding the Books
        Book book1 =  new Book("To Kill a Mockingbird" , 101 , "Harper Lee");
        Book book2 = new Book("1984" , 102 , "George Orwell");
        Book book3 = new Book("The Great Gatsby" , 103, "F. Scott Fitzgerald" );
        Book book4 = new Book("Pride and Prejudice" , 104, "Jane Austen" );
        Book book5 = new Book("The Catcher in the Rye" , 105, "J.D. Salinger" );
        Book book6 = new Book("Harry Potter and the Sorcerer's Stone" , 106, "J.K. Rowling" );
        Book book7 = new Book("The Hobbit" , 107, "J.R.R. Tolkien" );
        Book book8 = new Book("The Lord of the Rings" , 108, "J.R.R. Tolkien" );
        Book book9 = new Book("The Da Vinci Code" , 109, " Dan Brown" );
        Book book10 = new Book("The Hunger Games" , 110, "Suzanne Collins" );

        // Adding the Book in Cart
        fiction.add(book1);
        fiction.add(book2);
        fiction.add(book3);
        fiction.add(book4);
        fiction.add(book5);
        fiction.add(book6);
        fiction.add(book7);
        fiction.add(book8);
        fiction.add(book9);
        fiction.add(book10);

    }

   // Displaying the Fiction Mistry
    public void fictionMistryDetails(){


        System.out.println("********************************************************************************************");
        System.out.println("                                   WELCOME TO FICTION MISTRY");
        for (int i = 0 ; i <= 9 ; i++){
            System.out.println(fiction.get(i));
        }
        System.out.println("********************************************************************************************");
    }

    // Adding the Fiction Books (Romance Section)
    public void romanceSection(){


        // Adding the books
        Book book21 = new Book("Pride and Prejudice" ,201 , "Jane Austen");
        Book book22 = new Book("Jane Eyre" ,202 , "Charlotte Brontë");
        Book book23 = new Book("Outlander" , 203, " Diana Gabaldon");
        Book book24 = new Book("The Notebook" , 204, "Nicholas Sparks");
        Book book25 = new Book("Me Before You" , 205, "Jojo Moyes");
        Book book26 = new Book("Gone with the Wind" , 206, "Margaret Mitchell");
        Book book27 = new Book("The Fault in Our Stars" , 207, "John Green");
        Book book28 = new Book("The Time Traveler's Wife" , 208, "Audrey Niffenegger");
        Book book29 = new Book("The Rosie Project" , 209, " Graeme Simsion");
        Book book30 = new Book("Eleanor & Park" , 210, "Rainbow Rowell");


        // Adding the Books
        fiction.add(book21);
        fiction.add(book22);
        fiction.add(book23);
        fiction.add(book24);
        fiction.add(book25);
        fiction.add(book26);
        fiction.add(book27);
        fiction.add(book28);
        fiction.add(book29);
        fiction.add(book30);



    }

    // To Displaying the romances Books Section
    public void romanceDetails(){
        // Using for Loop
        System.out.println("********************************************************************************************");
        System.out.println("                                   Welcome To Romance Book Section");
        for (int i = 10 ; i <= 19 ; i++){
            System.out.println(fiction.get(i));
        }
        System.out.println("********************************************************************************************");
    }


    // Adding the Fiction Books (Science Section)
    public void scienceSection(){

        // Adding the Books
        Book book31 = new Book("A Brief History of Time", 301, "Stephen Hawking");
        Book book32 = new Book("The Selfish Gene", 302, "Richard Dawkins");
        Book book33 = new Book("The Double Helix: A Personal Account of the Discovery of the Structure of DNA", 303, "James D. Watson");
        Book book34 = new Book("Cosmos", 304, "Carl Sagan");
        Book book35 = new Book("The Origin of Species", 305, "Charles Darwin");
        Book book36 = new Book("The Elegant Universe: Superstrings, Hidden Dimensions, and the Quest for the Ultimate Theory", 306, " Brian Greene");
        Book book37 = new Book("Silent Spring", 307, "Rachel Carson");
        Book book38 = new Book("The Structure of Scientific Revolutions", 308, "Thomas S. Kuhn");
        Book book39 = new Book("Gödel, Escher, Bach: An Eternal Golden Braid", 309, "Douglas Hofstadter");
        Book book40 = new Book("The Immortal Life of Henrietta Lacks", 310, "Rebecca Skloot");


        // adding Books in Cart
    fiction.add(book31);
    fiction.add(book32);
    fiction.add(book33);
    fiction.add(book34);
    fiction.add(book35);
    fiction.add(book36);
    fiction.add(book37);
    fiction.add(book38);
    fiction.add(book39);
    fiction.add(book40);

    }

    // Displaying the Books Science Section
    public  void  scienceDetails() {
        // Using for Loop
        System.out.println("********************************************************************************************");
        System.out.println("                                   Welcome To Science Book Section");

        for (int i = 20 ; i <= 29 ; i++){
            System.out.println(fiction.get(i));
        }

        System.out.println("********************************************************************************************");
    }

    // Non Fiction Section
    public  void nonFiction(){
        System.out.println("               ********************************************************************************************");
        System.out.println("                                        WELCOME TO NON-FICTION SECTION");
        System.out.println("select 1 for Biography");
        System.out.println("select 2 for Autobiography");
        System.out.println("select 3 for Self Help");
        System.out.println("select 4 to go Back");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        switch (input){
            case 1:
                System.out.println("Biography");
                  biographyDetails();
                  user.lendingBookNonFiction();
                break;

            case 2:
                System.out.println("Autobiography");
                autobiographyDetails();
                user.lendingBookNonFiction();
                break;

            case 3:
                System.out.println("Self Help");
                selfHelpDetails();
                user.lendingBookNonFiction();
                break;

            case 4:
                System.out.println("To Go Back ");
                bookSection();
                break;
        }

    }

    //  Non-fiction  (Biography)
   public  void biographySection(){

        Book book41 = new Book("Steve Jobs" ,401 , "");
        Book book42 = new Book("The Diary of a Young Girl" , 402, "");
        Book book43 = new Book("Long Walk to Freedom" , 403, "");
        Book book44 = new Book("Unbroken: A World War II Story of Survival, Resilience, and Redemption" , 404, "");
        Book book45 = new Book("The Glass Castle: A Memoir" , 405, "");
        Book book46 = new Book("Becoming" , 406, "");
        Book book47 = new Book("Angela's Ashes" ,407 , "");
        Book book48 = new Book("The Autobiography of Malcolm X" ,408 , "");
        Book book49 = new Book("Into the Wild" ,409 , "");
        Book book50 = new Book("Eat, Pray, Love" , 410, "");

        // For adding the Book
          nonFiction.add(book41);
          nonFiction.add(book42);
          nonFiction.add(book43);
          nonFiction.add(book44);
          nonFiction.add(book45);
          nonFiction.add(book46);
          nonFiction.add(book47);
          nonFiction.add(book48);
          nonFiction.add(book49);
          nonFiction.add(book50);

   }

   // Displaying the details of Biography Section
    public void biographyDetails(){
        // Using for Loop
        System.out.println("********************************************************************************************");
        System.out.println("                                   Welcome To Biography Book Section");

        for (int i = 0 ; i <= 9 ; i++){
            System.out.println(nonFiction.get(i));
        }

        System.out.println("********************************************************************************************");
    }

   // Non-fiction (Autobiography)
   public void autobiographySection(){

        // Adding Books
       Book book51 = new Book("The Autobiography of Benjamin Franklin" , 501, "Benjamin Franklin");
       Book book52 = new Book("My Experiments with Truth" , 502, "Mahatma Gandhi");
       Book book53 = new Book("The Diary of a Young Girl" , 503, "Anne Frank");
       Book book54 = new Book("Dreams from My Father" , 504, "Barack Obama");
       Book book55 = new Book("I Know Why the Caged Bird Sings" , 505, "Maya Angelou");
       Book book56 = new Book("Bossypants" , 506, "Tina Fey");
       Book book57 = new Book("Open" , 507, "Andre Agassi");
       Book book58 = new Book("Born a Crime" , 508, "Trevor Noah");
       Book book59 = new Book("I Am Malala: The Story of the Girl Who Stood Up for Education and Was Shot by the Taliban" , 509, "Malala Yousafzai");
       Book book60 = new Book("Chronicles: Volume One" , 510, "Bob Dylan");

       // Adding to Non-fiction List
       nonFiction.add(book51);
       nonFiction.add(book52);
       nonFiction.add(book53);
       nonFiction.add(book54);
       nonFiction.add(book55);
       nonFiction.add(book56);
       nonFiction.add(book57);
       nonFiction.add(book58);
       nonFiction.add(book59);
       nonFiction.add(book60);

   }

   // Displaying autobiography Section
    public void autobiographyDetails(){
        // Using for Loop
        System.out.println("********************************************************************************************");
        System.out.println("                                   Welcome To Autobiography Book Section");

        for (int i = 10 ; i <= 19 ; i++){
            System.out.println(nonFiction.get(i));
        }

        System.out.println("********************************************************************************************");
    }

   // Non-fiction (Self Help)
    public void selfHelpSection(){

        // Adding Books
        Book book61 = new Book("The 7 Habits of Highly Effective People" ,601 , "Stephen R. Covey");
        Book book62 = new Book("How to Win Friends and Influence People" , 602, "Dale Carnegie");
        Book book63 = new Book("Atomic Habits: An Easy & Proven Way to Build Good Habits & Break Bad Ones" , 603, "James Clear");
        Book book64 = new Book("The Power of Now: A Guide to Spiritual Enlightenment" ,604 , "Eckhart Tolle");
        Book book65 = new Book("Think and Grow Rich" , 605, " Napoleon Hill");
        Book book66 = new Book("The Subtle Art of Not Giving a F*ck: A Counterintuitive Approach to Living a Good Life" ,606 , "Mark Manson");
        Book book67 = new Book("You Are a Badass: How to Stop Doubting Your Greatness and Start Living an Awesome Life" ,607 , "Jen Sincero");
        Book book68 = new Book("Mindset: The New Psychology of Success" , 608, "Carol S. Dweck");
        Book book69 = new Book("The Four Agreements: A Practical Guide to Personal Freedom" , 609, "Don Miguel Ruiz");
        Book book70 = new Book("Daring Greatly: How the Courage to Be Vulnerable Transforms the Way We Live, Love, Parent, and Lead" , 610, "Brené Brown");

        nonFiction.add(book61);
        nonFiction.add(book62);
        nonFiction.add(book63);
        nonFiction.add(book64);
        nonFiction.add(book65);
        nonFiction.add(book66);
        nonFiction.add(book67);
        nonFiction.add(book68);
        nonFiction.add(book69);
        nonFiction.add(book70);
    }

    // Displaying the  Details of selfHelpSection
        public void selfHelpDetails(){
            // Using for Loop
            System.out.println("********************************************************************************************");
            System.out.println("                                   Welcome To Self Help  Book Section");

            for (int i = 20 ; i <= 29 ; i++){
                System.out.println(nonFiction.get(i));
            }

            System.out.println("********************************************************************************************");
        }

    // Academic
    public void academic(){
        System.out.println("********************************************************************************************");
        System.out.println("                                        WELCOME TO ACADEMIC SECTION");
        System.out.println("select 1 for B.COM BOOKS");
        System.out.println("select 2 for ENGINEERING Books");
        System.out.println("select 3 for BSC Books");
        System.out.println("select 4 to go Back");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        switch (input){
            case 1:
                System.out.println("B.COM BOOKS");
                bcomSectionDetails();
                user.lendingBookAcademic();
                break;

            case 2:
                System.out.println("ENGINEERING Books");
                engsectionDetails();
                user.lendingBookAcademic();
                break;

            case 3:
                System.out.println("BSC Books");
                bscSectionDetails();
                user.lendingBookAcademic();
                break;

            case 4:
                System.out.println("To Go Back ");
                bookSection();
                break;
        }

    }


    // Academic B.Com Books
    public  void bcomSection(){

         // Adding the Books
        Book book71 = new Book("Principles of Economics",701 , "N. Gregory Mankiw");
        Book book72 = new Book("Financial Accounting", 702, "Jerry J. Weygandt, Donald E. Kieso, and Paul D. Kimmel");
        Book book73 = new Book("Business Mathematics", 703, "Gary Clendenen and Stanley A. Salzman");
        Book book74 = new Book("Business Communication: Process and Product", 704, "Mary Ellen Guffey and Dana Loewy");
        Book book75 = new Book("Corporate Finance",705 , "Stephen A. Ross, Randolph W. Westerfield, and Jeffrey Jaffe");
        Book book76 = new Book("Management Accounting: Principles and Applications",706 , "Leslie G. Eldenburg, Susan K. Wolcott, and Philip E. Fess");
        Book book77 = new Book("Business Law: Text and Cases", 707, "Kenneth W. Clarkson, Roger LeRoy Miller, and Frank B. Cross");
        Book book78 = new Book("Principles of Marketing", 708, "Philip T. Kotler and Gary Armstrong");
        Book book79 = new Book("Human Resource Management", 709, "Gary Dessler");
        Book book80 = new Book("International Business: Competing in the Global Marketplace", 710, "Charles W. L. Hill and G. Tomas M. Hult");


        // Adding the Details in List
        academic.add(book71);
        academic.add(book72);
        academic.add(book73);
        academic.add(book74);
        academic.add(book75);
        academic.add(book76);
        academic.add(book77);
        academic.add(book78);
        academic.add(book79);
        academic.add(book80);

    }

    // Displaying the details of Bcom Section
    public void bcomSectionDetails(){
        // Using for Loop
        System.out.println("********************************************************************************************");
        System.out.println("                                   Welcome To B.COM Book Section");
        for (int i = 0 ; i <= 9 ; i++){
            System.out.println(academic.get(i));
        }
        System.out.println("********************************************************************************************");
    }


    // Academic (Engineering Books)
    public void engineeringSection(){

        // Adding Books
        Book book81 = new Book("Engineering Mechanics: Dynamics" ,801 , " L.G. Kraige");
        Book book82 = new Book("Introduction to Chemical Engineering Thermodynamics" , 802, "H.C. Van Ness");
        Book book83 = new Book("Mechanics of Materials" , 803, "Russell C. Hibbeler");
        Book book84 = new Book("Electrical Engineering: Principles and Applications" , 804, "Allan R. Hambley");
        Book book85 = new Book("Fundamentals of Fluid Mechanics" , 805, "Theodore H.");
        Book book86 = new Book("Civil Engineering Materials" , 806, "Shan Somayaji");
        Book book87 = new Book("Introduction to Computer Engineering: Hardware and Software Design" , 807, " M. Morris Mano");
        Book book88 = new Book("Principles of Environmental Engineering and Science" , 808, "Mackenzie L. Davis");
        Book book89 = new Book("Structural Analysis" , 809, "Aslam Kassimali");
        Book book90 = new Book("Introduction to Aerospace Engineering with a Flight Test Perspective" , 810, "Stephen Corda");

        // Adding the Book in Cart
        academic.add(book81);
        academic.add(book82);
        academic.add(book83);
        academic.add(book84);
        academic.add(book85);
        academic.add(book86);
        academic.add(book87);
        academic.add(book88);
        academic.add(book89);
        academic.add(book90);

    }

    // Displaying the details of Eng Section
    public void engsectionDetails(){
        // Using for Loop
        System.out.println("********************************************************************************************");
        System.out.println("                                   Welcome To Engineering Book Section");
        for (int i = 10 ; i <= 19 ; i++){
            System.out.println(academic.get(i));
        }
        System.out.println("********************************************************************************************");
    }

    // Academic (Bsc Books)
    public void bscSection(){

        // Adding Books
        Book book91 = new Book("Physics for Scientists and Engineers" , 901, "Paul A. Tipler ");
        Book book92 = new Book("Physics for Scientists and Engineers" , 902, "Stuart Warren");
        Book book93 = new Book("Mathematical Methods for Physics and Engineering" , 903, "S.J. Bence ");
        Book book94 = new Book("Biology" , 904, "Michael Windelspecht");
        Book book95 = new Book("Fundamentals of Computer Science" , 905, "Richard F.");
        Book book96 = new Book("Introduction to Statistics and Data Analysis" , 906, "Roxy Peck");
        Book book97 = new Book("Principles of Economics" , 907, " N. Gregory Mankiw ");
        Book book98 = new Book("Environmental Science: Toward a Sustainable Future" , 908, " Richard T. Wright ");
        Book book99 = new Book("Introduction to Psychology" , 909, "James W. Kalat");
        Book book100 = new Book("Geology: An Introduction to Physical Geology" , 910, "Edward J. Tarbuck");

        // Adding Books to cart
        academic.add(book91);
        academic.add(book92);
        academic.add(book93);
        academic.add(book94);
        academic.add(book95);
        academic.add(book96);
        academic.add(book97);
        academic.add(book98);
        academic.add(book99);
        academic.add(book100);

    }

    // Displaying the Details of Bsc Section
    public void bscSectionDetails(){
        // Using for Loop
        System.out.println("********************************************************************************************");
        System.out.println("                                   Welcome To B.S.C Book Section");
        for (int i = 20 ; i <= 29 ; i++){
            System.out.println(academic.get(i));
        }
        System.out.println("********************************************************************************************");
    }


    // Children Books
    public  void childrenBook(){
        System.out.println("********************************************************************************************");
        System.out.println("                                  WELCOME TO CHILDREN'S SECTION");
        System.out.println("select 1 for Picture Book");
        System.out.println("select 2 for Young adult Books");
        System.out.println("select 3 for Middle-grade novels Books");
        System.out.println("select 4 to go Back");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        switch (input){
            case 1:
                System.out.println("Picture Book");
                pictureSectionDetails();
                user.lendingBookChildren();
                break;

            case 2:
                System.out.println("Young adult Books");
                youngBookSec();
                user.lendingBookChildren();
                break;

            case 3:
                System.out.println("Middle-grade novels Books");
                middleGradeNovelDetails();
                user.lendingBookChildren();
                break;

            case 4:
                System.out.println("To Go Back ");
                bookSection();
                break;
        }
    }

    // Children Books (Picture Books)
    public void pictureSection(){

        // Adding Books
        Book book101 = new Book("Where the Wild Things Are" ,1001  , "Maurice Sendak");
        Book book102 = new Book("The Very Hungry Caterpillar" ,  1002, "Eric Carle");
        Book book103 = new Book("Goodnight Moon" ,  1003, "Clement Hurd");
        Book book104 = new Book("The Snowy Day" ,  1004, "Ezra Jack Keats");
        Book book105 = new Book("Don't Let the Pigeon Drive the Bus!" ,  1005, "Mo Willems");
        Book book106 = new Book("The Gruffalo" ,  1006, "Axel Scheffler");
        Book book107 = new Book("Green Eggs and Ham" , 1007 , "Dr. Seuss");
        Book book108 = new Book("Corduroy" ,  1008, "Don Freeman");
        Book book109 = new Book("The Giving Tree" ,  1009, "Shel Silverstein");
        Book book110 = new Book("Brown Bear, Brown Bear, What Do You See?" ,  1010, "Bill Martin Jr");

        // Adding the Book in the List
        childrenBook.add(book101);
        childrenBook.add(book102);
        childrenBook.add(book103);
        childrenBook.add(book104);
        childrenBook.add(book105);
        childrenBook.add(book106);
        childrenBook.add(book107);
        childrenBook.add(book108);
        childrenBook.add(book109);
        childrenBook.add(book110);

    }

    // Displaying the picturesection Details
    public void pictureSectionDetails()
    {
        // Using for Loop
        System.out.println("********************************************************************************************");
        System.out.println("                                   Welcome To Picture Book Section");
        for (int i = 0 ; i <= 9 ; i++){
            System.out.println(childrenBook.get(i));
        }

        System.out.println("********************************************************************************************");
    }

    // Children Books (Young Adult Book)
    public void youngBookSec(){

        // Adding Books
        Book book201 = new Book("Harry Potter and the Sorcerer's Stone" , 2001, "J.K. Rowling");
        Book book202 = new Book("Matilda" ,2002 , "Roald Dahl");
        Book book203 = new Book("Charlotte's Web" ,2003 , "E.B. White");
        Book book204 = new Book("The Lion, the Witch and the Wardrobe" , 2004, "C.S. Lewis");
        Book book205 = new Book("Wonder" , 2005, "R.J. Palacio");
        Book book206 = new Book("The Secret Garden" ,2006 , "Frances Hodgson Burnett");
        Book book207 = new Book("Diary of a Wimpy Kid" ,2007 , "Jeff Kinney");
        Book book208 = new Book("Percy Jackson & the Olympians: The Lightning Thief" , 2008, "Rick Riordan");
        Book book209 = new Book("The Tale of Peter Rabbit" , 2009, "Beatrix Potter");
        Book book210 = new Book("The Hobbit" , 2010, "J.R.R. Tolkien");

         // Adding the Book in List
        childrenBook.add(book201);
        childrenBook.add(book202);
        childrenBook.add(book203);
        childrenBook.add(book204);
        childrenBook.add(book205);
        childrenBook.add(book206);
        childrenBook.add(book207);
        childrenBook.add(book208);
        childrenBook.add(book209);
        childrenBook.add(book210);
    }

    // Displaying the Details of Young Book Section
    public void youngsectionDetails(){
        // Using for Loop
        System.out.println("********************************************************************************************");
        System.out.println("                                   Welcome To Young Book Section");
        for (int i = 10 ; i <= 19 ; i++){
            System.out.println(childrenBook.get(i));
        }

        System.out.println("********************************************************************************************");
    }

    // Children Books (Middle Grade novels)
    public void middleGradeNovels(){

//        Adding Books
        Book books301 = new Book("Harry Potter and the Sorcerer's Stone" , 3001, "J.K. Rowling");
        Book books302 = new Book("Percy Jackson & the Olympians: The Lightning Thief" , 3002, "Rick Riordan");
        Book books303 = new Book("The Lightning Thief" , 3003, "Rick Riordan");
        Book books304 = new Book("Wonder" , 3004, "R.J. Palacio");
        Book books305 = new Book("The Chronicles of Narnia: The Lion, the Witch and the Wardrobe" ,3005 , "C.S. Lewis");
        Book books306 = new Book("Matilda" , 3006, "Roald Dahl");
        Book books307 = new Book("The One and Only Ivan" ,3007 , "Katherine Applegate");
        Book books308 = new Book("Holes" , 3008, "Louis Sachar");
        Book books309 = new Book("Bridge to Terabithia" , 3009, "Katherine Paterson");
        Book books310 = new Book("The Secret Garden" , 3010, "Frances Hodgson Burnett");

         // Adding the Books in Children List
      childrenBook.add(books301);
      childrenBook.add(books302);
      childrenBook.add(books303);
      childrenBook.add(books304);
      childrenBook.add(books305);
      childrenBook.add(books306);
      childrenBook.add(books307);
      childrenBook.add(books308);
      childrenBook.add(books309);
      childrenBook.add(books310);
    }

    // Displaying the Details Middle Grade Novels
    public void middleGradeNovelDetails(){
        // Using for Loop
        System.out.println("********************************************************************************************");
        System.out.println("                                   Welcome To Middle Grade Novels Section");
        for (int i = 20 ; i <= 29 ; i++){
            System.out.println(childrenBook.get(i));
        }

        System.out.println("********************************************************************************************");
    }

    // Other Category
    public void otherCatergory(){
        System.out.println("*******************************************************************************************************************");
        System.out.println("                                               WELCOME TO OTHER CATEGORIES SECTION");
        System.out.println("select 1 for Poetry Book");
        System.out.println("select 2 for Comics and Graphic Novels");
        System.out.println("select 3 for Plays");
        System.out.println("select 4 to go Back");
        System.out.println("********************************************************************************************");


        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        switch (input){
            case 1:
                System.out.println("Poetry Book");
                poetrySectionDetails();
                user.lendingOtherBook();
                break;

            case 2:
                System.out.println("Comics and Graphic Novels");
                comicsPlaysDetails();
                user.lendingOtherBook();
                break;

            case 3:
                System.out.println("Plays");
               playSectionDetails();
                user.lendingOtherBook();
                break;

            case 4:
                System.out.println("To Go Back ");
                bookSection();
                break;
        }
    }

    // Other Categories (Poetry)
    public  void poetrySection(){

        // Adding books
        Book book401 = new Book("Milk and Honey",4001, "Rupi Kaur");
        Book book402 = new Book("The Sun and Her Flowers",4002, "Rupi Kaur");
        Book book403 = new Book("The Poet X",4003, "Elizabeth Acevedo");
        Book book404 = new Book("Leaves of Grass",4004, "Walt Whitman");
        Book book405 = new Book("Ariel",4005, "Sylvia Plath");
        Book book406 = new Book("The Waste Land",4006, "T.S. Eliot");
        Book book407 = new Book("The Essential Rumi",4007, " Coleman Barks");
        Book book408 = new Book("Selected Poems",4008, "Langston Hughes");
        Book book409 = new Book("The Collected Poems of Emily Dickinson",4009, " Emily Dickinson");
        Book book410 = new Book("The Complete Works of William Shakespeare",4010, "William Shakespeare");

        otherBook.add(book401);
        otherBook.add(book402);
        otherBook.add(book403);
        otherBook.add(book404);
        otherBook.add(book405);
        otherBook.add(book406);
        otherBook.add(book407);
        otherBook.add(book408);
        otherBook.add(book409);
        otherBook.add(book410);

    }

    // Displaying the details of poetry Section
   public void poetrySectionDetails(){
       // Using for Loop
       System.out.println("********************************************************************************************");
       System.out.println("                                   Welcome To Poetry Book Section");
       for (int i = 0 ; i <= 9 ; i++){
           System.out.println(otherBook.get(i));
       }

       System.out.println("********************************************************************************************");
   }

    // Other Categories (Comics And Graphic Novels)
    public void comicsSection(){

        // To add Book
        Book book501 = new Book("Watchmen" , 5001, "Dave Gibbons");
        Book book502 = new Book("Maus" , 5002, "Art Spiegelman");
        Book book503 = new Book("Sandman" , 5003, "Neil Gaiman");
        Book book504 = new Book("Persepolis" ,5004 , "Marjane Satrapi");
        Book book505 = new Book("Saga" ,5005 , "Fiona Staples");
        Book book506 = new Book("Batman: The Dark Knight Returns" , 5006, "Frank Miller");
        Book book507 = new Book("Fun Home: A Family Tragicomic" , 5007, "Alison Bechdel");
        Book book508 = new Book("Y: The Last Man" ,5008 , "Brian K. Vaughan ");
        Book book509 = new Book("Blankets" ,5009 , "Craig Thompson");
        Book book510 = new Book("Bone" , 5010, "Jeff Smith");

        //Adding the Book in Cart
        otherBook.add(book501);
        otherBook.add(book502);
        otherBook.add(book503);
        otherBook.add(book504);
        otherBook.add(book505);
        otherBook.add(book506);
        otherBook.add(book507);
        otherBook.add(book508);
        otherBook.add(book509);
        otherBook.add(book510);
    }

    // Displaying the Details of Comics Plays
    public void comicsPlaysDetails(){
        // Using for Loop
        System.out.println("********************************************************************************************");
        System.out.println("                                   Welcome To Comics Plays Book Section");
        for (int i = 10 ; i <= 19 ; i++){
            System.out.println(otherBook.get(i));
        }

        System.out.println("********************************************************************************************");
    }

    // Other Categories (Plays)
    public  void playSection(){

        // Books
        Book book601 = new Book("Hamlet" , 6001, "William Shakespeare");
        Book book602 = new Book("Romeo and Juliet" ,6002 , "William Shakespeare");
        Book book603 = new Book("Macbeth" , 6003, "William Shakespeare");
        Book book604 = new Book("A Streetcar Named Desire" , 6004, " Tennessee Williams");
        Book book605 = new Book("Death of a Salesman" , 6005, "Arthur Miller");
        Book book606 = new Book("The Importance of Being Earnest" , 6006, "Oscar Wilde");
        Book book607 = new Book("Oedipus Rex" , 6007, " Sophocles");
        Book book608 = new Book("The Glass Menagerie" , 6008, "Tennessee Williams");
        Book book609 = new Book("Waiting for Godot" , 6009, "Samuel Beckett");
        Book book610 = new Book("The Crucible" , 6010, "Arthur Miller");


        // Adding the Book in List
        otherBook.add(book601);
        otherBook.add(book602);
        otherBook.add(book603);
        otherBook.add(book604);
        otherBook.add(book605);
        otherBook.add(book606);
        otherBook.add(book607);
        otherBook.add(book608);
        otherBook.add(book609);
        otherBook.add(book610);

    }

    // Displaying the details of Playsection
    public void playSectionDetails(){
        // Using for Loop
        System.out.println("********************************************************************************************");
        System.out.println("                                   Welcome To Play  Section");
        for (int i = 20 ; i <= 29 ; i++){
            System.out.println(otherBook.get(i));
        }

        System.out.println("********************************************************************************************");
    }

    // Displaying the Newly Added Book
    public void newlyAddedBook(){

        if (cart.isEmpty()){
            System.out.println("Cart Is Empty Please Add the Details First ");
        } else {
            System.out.println(" ******************************************************************************************************************************************************");
            System.out.println("                                                                       Newly Added Books ");
            System.out.println("  ");
            System.out.println(cart);
            System.out.println(" ******************************************************************************************************************************************************");
        }



    }

    public int getId() {
        return booksId;
    }
}


