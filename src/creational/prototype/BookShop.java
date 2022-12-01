package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Clonable {

    private String location;
    private String shopName;
    List<Book> books = new ArrayList();


    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void loadBooksData() {

        // loading data from database which is a costly operation

        for(int i = 1 ; i<=10 ; i++ ) {
            Book book = new Book("book"+i, "author"+i);
            books.add(book);
        }
    }

    @Override
    public String toString() {
        return "BookShop{"+ books +
                '}';
    }

    @Override
    public BookShop clone() {
        BookShop clonedShop = new BookShop();
        for(Book b : this.books) {
            clonedShop.getBooks().add(b);
        }
        return clonedShop;
    }
}