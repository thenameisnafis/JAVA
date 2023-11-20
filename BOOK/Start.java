public class Start {
    public static void main(String[] args) {
        // Create five objects of TextBook
        TextBook textBook1 = new TextBook("ISBN001", "Java Programming", "John Doe", 49.99, 50, 10);
        TextBook textBook2 = new TextBook("ISBN002", "Data Structures", "Jane Smith", 39.99, 30, 12);
        TextBook textBook3 = new TextBook("ISBN003", "Algorithms", "Alice Johnson", 59.99, 25, 11);
        TextBook textBook4 = new TextBook("ISBN004", "Database Management", "Bob Anderson", 44.99, 40, 9);
        TextBook textBook5 = new TextBook("ISBN005", "Web Development", "Emily Davis", 34.99, 20, 10);

        // Create five objects of StoryBook
        StoryBook storyBook1 = new StoryBook("ISBN101", "The Adventures", "Alice Wonderland", 19.99, 20, "Fantasy");
        StoryBook storyBook2 = new StoryBook("ISBN102", "Mystery Mansion", "Bob Detective", 29.99, 15, "Mystery");
        StoryBook storyBook3 = new StoryBook("ISBN103", "Love in Paris", "Emma Thompson", 24.99, 30, "Romance");
        StoryBook storyBook4 = new StoryBook("ISBN104", "Science Fiction", "Chris Harris", 39.99, 18, "Sci-Fi");
        StoryBook storyBook5 = new StoryBook("ISBN105", "Historical Drama", "Daniel Clark", 32.99, 25, "Historical");

        // Create one object of BookShop
        BookShop bookShop = new BookShop("My Bookstore");

        // Demonstrate methods and constructors
        System.out.println("Adding TextBooks to the bookstore:");
        bookShop.insertTextBook(textBook1);
        bookShop.insertTextBook(textBook2);
        bookShop.insertTextBook(textBook3);
        bookShop.insertTextBook(textBook4);
        bookShop.insertTextBook(textBook5);

        System.out.println("\nShowing all TextBooks in the bookstore:");
        bookShop.showAllTextBooks();

        System.out.println("\nSearching for a TextBook by ISBN (ISBN003):");
        TextBook searchedTextBook = bookShop.searchTextBook("ISBN003");
        if (searchedTextBook != null) {
            searchedTextBook.showDetails();
        } else {
            System.out.println("TextBook not found.");
        }

        System.out.println("\nRemoving a TextBook by ISBN (ISBN002):");
        bookShop.removeTextBook(textBook2);

        System.out.println("\nShowing all TextBooks after removal:");
        bookShop.showAllTextBooks();

        System.out.println("\nAdding StoryBooks to the bookstore:");
        bookShop.insertStoryBook(storyBook1);
        bookShop.insertStoryBook(storyBook2);
        bookShop.insertStoryBook(storyBook3);
        bookShop.insertStoryBook(storyBook4);
        bookShop.insertStoryBook(storyBook5);

        System.out.println("\nShowing all StoryBooks in the bookstore:");
        bookShop.showAllStoryBooks();

        System.out.println("\nSearching for a StoryBook by ISBN (ISBN103):");
        StoryBook searchedStoryBook = bookShop.searchStoryBook("ISBN103");
        if (searchedStoryBook != null) {
            searchedStoryBook.showDetails();
        } else {
            System.out.println("StoryBook not found.");
        }

        System.out.println("\nRemoving a StoryBook by ISBN (ISBN102):");
        bookShop.removeStoryBook(storyBook2);

        System.out.println("\nShowing all StoryBooks after removal:");
        bookShop.showAllStoryBooks();
    }
}