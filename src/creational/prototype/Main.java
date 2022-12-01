package creational.prototype;

public class Main {

    public static void main(String[] args) {
       BookShop bookShop1 = new BookShop();

       bookShop1.setShopName("bs1");
       bookShop1.setLocation("Hyd");
       bookShop1.loadBooksData();

       System.out.println(bookShop1);

      BookShop bookShop2 = bookShop1.clone();
      bookShop2.setLocation("Delhi");
      bookShop2.setShopName("bs2");

        System.out.println(bookShop2);

    }
}
