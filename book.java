class Book {
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;

    // Default constructor
    public Book() {
        this.isbn = "";
        this.bookTitle = "";
        this.authorName = "";
        this.price = 0.0;
        this.availableQuantity = 0;
    }

    // Parameterized constructor
    public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity) {
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    // Setter methods
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    // Getter methods
    public String getIsbn() {
        return isbn;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    // Method to add quantity
    public void addQuantity(int amount) {
        availableQuantity += amount;
    }

    // Method to sell quantity
    public void sellQuantity(int amount) {
        if (availableQuantity >= amount) {
            availableQuantity -= amount;
        } else {
            System.out.println("Insufficient quantity available for sale.");
        }
    }

    // Method to display book details
    public void showDetails() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + authorName);
        System.out.println("Price: $" + price);
        System.out.println("Available Quantity: " + availableQuantity);
    }
}

public class Start {
    public static void main(String[] args) {
        // Create two Book objects using different constructors
        Book book1 = new Book();
        Book book2 = new Book("978-0-123456-78-9", "Java Programming", "John Doe", 29.99, 50);

        // Demonstrate setter methods
        book1.setIsbn("978-1-234567-89-0");
        book1.setBookTitle("Introduction to Java");
        book1.setAuthorName("Jane Smith");
        book1.setPrice(24.99);
        book1.setAvailableQuantity(30);

        // Demonstrate getter methods
        System.out.println("ISBN of book1: " + book1.getIsbn());
        System.out.println("Title of book1: " + book1.getBookTitle());
        System.out.println("Author of book1: " + book1.getAuthorName());
        System.out.println("Price of book1: $" + book1.getPrice());
        System.out.println("Available Quantity of book1: " + book1.getAvailableQuantity());

        // Demonstrate addQuantity and sellQuantity methods
        book1.addQuantity(10);
        book1.sellQuantity(5);

        // Display book details
        System.out.println("\nBook1 Details:");
        book1.showDetails();

        System.out.println("\nBook2 Details:");
        book2.showDetails();
    }
}
