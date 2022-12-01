package creational.prototype;

public class Book {

    String bookName;
    String author;

    Book(String bookName, String author){
        this.bookName = bookName;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
