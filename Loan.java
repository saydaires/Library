package com.mycompany.library;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Loan {
    private final User user;
    private final Book book;
    private final Calendar loanDate;
    private final Calendar returnDate;
    private LoanStatus loanStatus;
    private DelayStatus delayStatus;
    private int amountDaysDelayed;
    private double fineForDelay;
    
    public Loan(User user, Book book, Calendar loanDate, Calendar returnDate)
    {
        this.user = user;
        this.book = book;
        this.loanDate =loanDate;
        this.returnDate = returnDate;
        loanStatus = LoanStatus.LOANED;
        delayStatus = DelayStatus.REGULATE;
        amountDaysDelayed = 0;
        fineForDelay = 0.0;
    }
    
    
    
    public String toString()
    {
        // creating the Calendar String's formatted 'loan' and 'return' date's 
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String loanDateFormatted = dateFormat.format(loanDate.getTime());
        String returnDateFormatted = dateFormat.format(returnDate.getTime());
        // these above Strings's created will be use in String.format below
        
        return String.format("USER ID: %d%nUSER NAME: %s%nUSER POSITION: %s%n"+
        "%nBOOK TITLE: %s%nBOOK ISBN: %s%n%nLOAN DATE: %s%nRETURN DATE: %s%n" +
        "%nLOAN STATUS: %s%nDELAY STATUS: %s%n%nAMOUNT DAYS DELAYED"+
        ": %d%nFINE FOR DELAY: $ %.2f%n", user.getId(), user.getName(),
        user.getUserType(), book.getTitle(), book.getIsbn(), loanDateFormatted,
        returnDateFormatted, loanStatus.getLoanStatus(), 
        delayStatus.getDelayStatus(), amountDaysDelayed, fineForDelay);
    }
}
