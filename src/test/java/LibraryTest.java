import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {


    Book book1;
    Book book2;
    Book book3;
    Library library;

    @Before
    public void before(){
        book1 = new Book("Lord of the rings", "Tolken", "Fantasy");
        book2 = new Book("The Art of the Deal", "Donald Trump", "Fantasy");
        book3 = new Book("Under the Dome", "Stephen King", "Fantasy");
        library = new Library();
    }

    @Test
    public void shouldCountBooksInLibrary(){
        assertEquals( 0, library.countBooks());
    }

    @Test
    public void shouldBeAbleToAddBooksToLibrary(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3, library.countBooks());
    }

    @Test
    public void shouldBeAbleToTellIfFull_False(){
        assertEquals(false, library.isLibraryFull());
    }

    @Test
    public void shouldBeAbleToTellIfFull_True(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(true, library.isLibraryFull() );
    }

}
