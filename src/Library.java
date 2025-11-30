import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books;
    public Library(String libraryName) {
        this.books = new ArrayList<>();
    }
    public void addBook(Book book){
        this.books.add(book);
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
        boolean removed = books.removeIf(book -> book.getId().equals(bookId));
        if(removed){
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
}
