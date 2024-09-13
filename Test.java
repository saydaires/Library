//package com.mycompany.library;

public class Test {
    public static void main(String[] args)
    {
        // testing create Book instance
        Book book1 = new Book("Harry Potter", "JK Rowling", "12345@#01");
        System.out.println(book1);
        // testing the setStatus at the enum constant BookStatus by book1;
        book1.setStatus(BookStatus.UNAVAILABLE);
        System.out.println(book1);
        // testing any methods book1
        System.out.println("The book " + book1.getTitle() + 
        " currently have " + book1.getStatus() + " status");
    }
}
