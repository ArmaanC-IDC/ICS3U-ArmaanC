package day3;

public class Library {
    // Attributes
    private Book[] books; // Array to store books
    private int numOfBooks; // Number of books currently in the library

    // Constructor
    public Library(int size) {
        books = new Book[size]; // Initialize the array with the given size
        numOfBooks = 0; // Start with 0 books
    }

    // Method to add a book to the library
    public boolean addBook(Book book) {
        if (numOfBooks < books.length) {
            books[numOfBooks] = book; // Add book to the array
            numOfBooks++; // Increment the count of books
            return true; // Indicate successful addition
        } else {
            System.out.println("Library is full. Cannot add more books.");
            return false; // Indicate failure to add book
        }
    }

    // Stub method to borrow a book
    public Book borrowBook(String title) {
        for (int i = 0; i < numOfBooks; i++) {
            if (books[i].getTitle().equals(title) && !books[i].isBorrowed()){
                books[i].setBorrowed(true);
                return books[i];
            }
        }
        System.out.println("unable to borrow book");
        return null;
    }

    // Stub method to display all books
    public void displayBooks() {
        for (Book book : books){
            if (book!=null){
                System.out.println(book);
            }
        }
    }

    public void displayAvailableBooks() {
        for (Book book : books){
            if (book!=null && !book.isBorrowed()){
                System.out.println(book);
            }
        }
    }
}
