package Book;

public class BookMain {
    public static void main(String[] args) {

        Book book = new Book("Hello Java", "kim", 700);
        book.displayInfo();

        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("Hello Java", "kim");
        book2.displayInfo();

    }
}
