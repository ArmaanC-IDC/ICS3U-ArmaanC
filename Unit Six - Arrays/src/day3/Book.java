package day3;

public class Book {
    // Attributes
    private String author;
    private String title;
    private boolean isBorrowed;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false; // Default to false
    }

    // Getters
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    // Setters
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    // toString Method
    @Override
    public String toString() {
        return "Title: " + title + '\n'
                + "Author: " + author + '\n'
                + "isBorrowed: " + isBorrowed + '\n';
    }
}
