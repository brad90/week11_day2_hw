import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowedBooks;

    public Borrower(String name){
        this.name = name;
        this.borrowedBooks = new ArrayList<Book>();
    }


    public String getName() {
        return this.name;
    }

    public int numberOfBooksBorrowed() {
        return this.borrowedBooks.size();
    }

    public void borrowBookFromLibrary(Library library){
        Book book = library.lendBookFromLibrary(int index);
        this.borrowedBooks.add(book);
    }
}
