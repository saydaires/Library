
package com.mycompany.library;
import java.util.Calendar;
public class Test {
    public static void main(String[] args)
    {
        //Date's tests
        Calendar loanDate = Calendar.getInstance();
        Calendar returnDate = Calendar.getInstance();
        loanDate.set(2024, 9, 14);
        returnDate.set(2024, 9, 21);
        // testing create Book instance
        Book bookTest = new Book("Harry Potter", "JK Rowling", "12345@#01");
        User userTest = new User(1, "Sayd", UserType.STUDENT);
        Loan loanTest = new Loan(userTest, bookTest, loanDate, returnDate);
        System.out.println(loanTest);
    }
}
