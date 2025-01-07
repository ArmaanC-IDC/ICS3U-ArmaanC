package day2;

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book(String title, String author, int yearPublished, double price){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.yearPublished = 2000;
        this.price = 9.99;
    }

    public Book(String title){
        this.title = title;
        this.author = "Unknown Author";
        this.yearPublished = 2000;
        this.price = 9.99;
    }

    public void displayDetails(){
        System.out.println("Title: " + title + " Author: " + author + " Year Published: " + yearPublished + " Price" + price);
    }

    public void displayDetails(boolean showTitleAndAuthorOnly){
        if (showTitleAndAuthorOnly){
            System.out.println("Title: " + title + " Author: " + author);
        }else{
            displayDetails();
        }
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return yearPublished;
    }

    public double getPrice(){
        return price;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setYearPublished(int yearPublished){
        this.yearPublished = yearPublished;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
