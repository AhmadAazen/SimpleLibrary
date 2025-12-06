import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("HarryPotter","JK Rowling");
        Book book2 = new Book("LOTR","Bilbo Baggins");
        Book book3 = new Book("One Piece","Eichiro Oda");

        Member member1 = new Member("Aazen");
        Member member2 = new Member("Aawez");

        Library library = new Library("Fiction");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addMember(member1);
        library.addMember(member2);

        Scanner sc = new Scanner(System.in);
        boolean running=true;
        while(running){

            System.out.println("Menu:");
            System.out.println("1: List all books");
            System.out.println("2: Issue a book by id");
            System.out.println("3: Return a book by id");
            System.out.println("4: Remove a book by id");
            System.out.println("5: Add Book to Library");
            System.out.println("6: Add Member to Library");
            System.out.println("7: Print All Members");
            System.out.println("0: Exit");

            System.out.println("Select an option to proceed");
            int choice = sc.nextInt();
            int bookId;
            switch(choice){
                case 1: System.out.println("ALL BOOKS:");
                        library.printAllBooks();
                break;
                case 2: System.out.println("ISSUE BOOK BY ID: ");
                        bookId= sc.nextInt();
                        System.out.println("ISSUING THE BOOK TO MEMBER WITH ID: ");
                        int memberId= sc.nextInt();

                        library.issueBookToMember(bookId,memberId);
                break;
                case 3: System.out.println("RETURN BOOK BY ID: ");
                        bookId= sc.nextInt();
                        library.returnBookById(bookId);
                break;
                case 4: System.out.println("REMOVE BOOK BY ID: ");
                        bookId= sc.nextInt();
                        library.removeBookById(bookId);
                break;
                case 5: System.out.println("ADD BOOK WITH: ");
                        System.out.println("TITLE: ");
                        String title= sc.next();
                        System.out.println("AUTHOR: ");
                        String author= sc.next();
                        Book book = new Book(title,author);
                        library.addBook(book);
                break;
                case 6: System.out.println("ADD MEMBER WITH: ");
                        System.out.println("NAME: ");
                        String name= sc.next();
                        Member member = new Member(name);
                        library.addMember(member);
                break;
                case 7: System.out.println("ALL MEMBERS:");
                        library.printAllMembers();
                break;
                case 0: System.out.println("BYE BYE");
                        running=false;
                break;
                default:System.out.println("Choose the numbers shown on menu only please");
            }
        }
        sc.close();








//        book1.issueTo(member1);
//        System.out.println(book1);
//        book1.issueTo(member2);
//        System.out.println(book1);
//        book1.returnBook();
//        System.out.println(book1);
//        book1.issueTo(member2);
//        System.out.println(book1);
//        System.out.println(book2);


//        book2.returnBook();
//        library.printAllBooks();
//        library.issueBookToMember(1,member2);
//        library.issueBookToMember(1,member2);
//        library.issueBookToMember(4,member1);
//        Book book=library.getBookById(3);
//        if(book!=null){book.issueTo(member1);}
//
//
//        library.removeBookById(3);
//        library.removeBookById(3);
//        library.printAllBooks();

    }
}