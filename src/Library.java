import java.util.*;

public class Library {
    private final List<Book> books;
    private final Map<Integer,Book> bookById ;
    private final Map<Integer,Member> memberById;

    public Library(String libraryName) {
        this.books = new ArrayList<>();
        this.bookById = new HashMap<>();
        this.memberById = new HashMap<>();
    }
    public void addBook(Book book){
        this.books.add(book);
        this.bookById.put(book.getId(),book);
    }
    public void addMember(Member member){
        this.memberById.put(member.getMemberId(),member);
    }
    public void removeBookById(Integer bookId){
        //Can cause ConcurrentModificationException
//        for(Book book : books){
//            if(book.getId().equals(bookId)) {
//                books.remove(book);
//                System.out.println(book+"with BookId"+bookId+" has been removed");
//                return;
//            }
//        }

        //Safer way is to use removeIf function which uses predicate
        Book removedBook = bookById.remove(bookId);
        if(removedBook!=null){
            books.removeIf(book -> book.getId().equals(bookId));
            System.out.println("Book with id " + bookId + " has been removed");
        }
        else
            System.out.println("Book with id " + bookId + " not found");
    }
    public Book findBookByTitle(String title){
        for(Book book : books){
            if(book.getTitle().equals(title)){
                System.out.println("Book with title " + title + " found");
                return book;
            }
        }
        System.out.println("Book with title " + title + " not found");
        return null;
    }
    public void printAllBooks(){
        for(Book book : books){
            System.out.println(book);
        }
    }
    public void printAllMembers(){
        Set<Map.Entry<Integer, Member>> entries = memberById.entrySet();
        for(Map.Entry<Integer, Member>entry:entries){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
    public Book getBookById(Integer bookId){
        return bookById.get(bookId);
    }
    public Member getMemberById(Integer memberId){
        return  memberById.get(memberId);
    }
    public void issueBookToMember(Integer bookId,Integer memberId){
        Book book = getBookById(bookId);
        Member member=getMemberById(memberId);
        if(book==null || member==null){
            if(book==null) {
                System.out.println("Book with id: " + bookId + " not found");
            }
            if(member==null){
                System.out.println("Member with id: " + memberId + " not found");
            }
        }else{
            book.issueTo(member);
        }
    }
    public void returnBookById(Integer bookId){
        Book book = getBookById(bookId);
        if(book!=null){
            book.returnBook();
        }else{
            System.out.println("Book with id: "+bookId+" not found");
        }
    }

}
