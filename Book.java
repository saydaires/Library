//package com.mycompany.library;
public class Book {
    private final String title;
    private final String author;
    private final String isbn;
    // at this point, the final statement on above attributes may be appropiate
    private BookStatus status;
    
    public Book(String title, String author, String isbn)
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        // ever a new Book instance was created, your status must be AVAILABLE
        status = BookStatus.AVAILABLE;
    }
    
    public void setStatus(BookStatus status)
    {
        this.status = status;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public String getIsbn()
    {
        return isbn;
    }
    
    public BookStatus getStatus()
    {
        // NOTE: this method only could return the ENUM constant of instance 
        return status;
    }
    
    public String toString()
    {
        return String.format("TITLE: %s%nAUTHOR: %s%nISBN: %s%nSTATUS: %s%n",
        title, author, isbn, status.getBookStatus());
    }
}
