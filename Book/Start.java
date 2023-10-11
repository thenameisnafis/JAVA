import java.lang.*;

public class Start {
    public static void main(String[] args) {
        Book book = new Book();

        book.setIsbn("9780131489523");
        book.setBookTitle("Introduction to Java Programming");
        book.setAuthorName("Y. Daniel Liang");
        book.setPrice(17.09);
        book.setAvailableQuantity(30);

        System.out.println("ISBN of book: " + book.getIsbn());
        System.out.println("Title of book: " + book.getBookTitle());
        System.out.println("Author of book: " + book.getAuthorName());
        System.out.println("Price of book: $" + book.getPrice());
        System.out.println("Available Quantity of book: " + book.getAvailableQuantity());

        book.addQuantity(10);
        book.sellQuantity(5);

        System.out.println("\nBook Details:");
        book.showDetails();

    }
}