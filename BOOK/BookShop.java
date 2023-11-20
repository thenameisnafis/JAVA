class BookShop {
    private String name;
    private TextBook[] textBooks = new TextBook[100];
    private StoryBook[] storyBooks = new StoryBook[100];

    public BookShop() {
    }

    public BookShop(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean insertTextBook(TextBook tb) {
        // Logic to insert a TextBook into the array
        for (int i = 0; i < textBooks.length; i++) {
            if (textBooks[i] == null) {
                textBooks[i] = tb;
                return true;
            }
        }
        return false; // Array is full
    }

    public boolean removeTextBook(TextBook tb) {
        // Logic to remove a TextBook from the array
        for (int i = 0; i < textBooks.length; i++) {
            if (textBooks[i] != null && textBooks[i].getIsbn().equals(tb.getIsbn())) {
                textBooks[i] = null;
                return true;
            }
        }
        return false; // TextBook not found
    }

    public TextBook searchTextBook(String isbn) {
        // Logic to search for a TextBook in the array based on ISBN
        for (TextBook tb : textBooks) {
            if (tb != null && tb.getIsbn().equals(isbn)) {
                return tb;
            }
        }
        return null; // TextBook not found
    }

    public void showAllTextBooks() {
        // Logic to display details of all TextBooks in the array
        for (TextBook tb : textBooks) {
            if (tb != null) {
                tb.showDetails();
                System.out.println("Standard: " + tb.getStandard());
                System.out.println();
            }
        }
    }

    public boolean insertStoryBook(StoryBook sb) {
        // Logic to insert a StoryBook into the array
        for (int i = 0; i < storyBooks.length; i++) {
            if (storyBooks[i] == null) {
                storyBooks[i] = sb;
                return true;
            }
        }
        return false; // Array is full
    }

    public boolean removeStoryBook(StoryBook sb) {
        // Logic to remove a StoryBook from the array
        for (int i = 0; i < storyBooks.length; i++) {
            if (storyBooks[i] != null && storyBooks[i].getIsbn().equals(sb.getIsbn())) {
                storyBooks[i] = null;
                return true;
            }
        }
        return false; // StoryBook not found
    }

    public StoryBook searchStoryBook(String isbn) {
        // Logic to search for a StoryBook in the array based on ISBN
        for (StoryBook sb : storyBooks) {
            if (sb != null && sb.getIsbn().equals(isbn)) {
                return sb;
            }
        }
        return null; // StoryBook not found
    }

    public void showAllStoryBooks() {
        // Logic to display details of all StoryBooks in the array
        for (StoryBook sb : storyBooks) {
            if (sb != null) {
                sb.showDetails();
                System.out.println("Category: " + sb.getCategory());
                System.out.println();
            }
        }
    }
}
