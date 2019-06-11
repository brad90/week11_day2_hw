import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("Harry Potter", "Rowling", "Fantasy");
    }

    @Test
    public void getBookTitle(){
        assertEquals("Harry Potter", book.getTitle());
    }

    @Test
    public void getBookAuthor(){
        assertEquals("Rowling", book.getAuthor());
    }

    @Test
    public void getBookGenre(){
        assertEquals("Fantasy", book.getGenre());
    }


}
