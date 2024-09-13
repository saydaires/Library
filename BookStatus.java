//package com.mycompany.library;

public enum BookStatus {
    AVAILABLE("Available"),
    UNAVAILABLE("Unavailable");
    
    private String bookStatus;
    
    BookStatus(String bookStatus)
    {
        this.bookStatus = bookStatus;
    }
    
    public String getBookStatus()
    {
        return bookStatus;
    }
}
