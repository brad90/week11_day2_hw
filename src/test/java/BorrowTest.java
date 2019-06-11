import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowTest {

    Library library;
    Borrower borrower;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void before(){
        book1 = new Book("Lord of the rings", "Tolken", "Fantasy");
        book2 = new Book("The Art of the Deal", "Donald Trump", "Fantasy");
        book3 = new Book("Under the Dome", "Stephen King", "Fantasy");
        library = new Library();
        borrower = new Borrower("Barry");
    }


    @Test
    public void shouldGetBackAName(){
        assertEquals("Barry", borrower.getName());
    }

    @Test
    public void shouldGetBackBorrowedBookNumber(){
        assertEquals(0 , borrower.numberOfBooksBorrowed());
    }

    @Test
    public void shouldBeAbleToBorrowBookFromLibrary(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        borrower.borrowBookFromLibrary(library);
        library.lendBookFromLibrary(1);
        assertEquals(1, borrower.numberOfBooksBorrowed() );
    }
}
