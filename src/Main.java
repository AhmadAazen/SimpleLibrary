//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book book1 = new Book(1,"HarryPotter","JK Rowling");
        Book book2 = new Book(2,"LOTR","Bilbo Baggins");
        Book book3 = new Book(3,"One Piece","Eichiro Oda");

        Member member1 = new Member(1,"Aazen");
        Member member2 = new Member(2,"Aawez");
        book1.issueTo(member1);
        System.out.println(book1);
        book1.issueTo(member2);
        System.out.println(book1);
        book1.returnBook();
        System.out.println(book1);
        book1.issueTo(member2);
        System.out.println(book1);
        book2.returnBook();
        System.out.println(book2);

    }
}