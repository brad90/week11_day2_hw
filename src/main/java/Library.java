import java.util.ArrayList;

public class Library {


    private ArrayList<Book> library;

    public Library() {
        this.library = new ArrayList<Book>();
    }


    public int countBooks() {
        return this.library.size();
    }

    public void addBook(Book book) {
        this.library.add(book);
    }

    public boolean isLibraryFull() {
        if(this.countBooks() > 10 ){
            return true;
        }else{
            return false;
        }
    }

    public Book lendBookFromLibrary(int index) {
        return this.library.get(index);
    }
}
