import java.util.HashMap;

public class Book {

    private String title;
    private String author;
    private String genre;
    private HashMap<String,String> book = new HashMap<String,String>();


    public Book(String title, String author, String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.book.put("Title", this.title);
        this.book.put("Author", this.author);
        this.book.put("Genre", this.genre);
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getGenre() {
        return this.genre;
    }



}
