package com.mycompany.library;

public enum LoanStatus {
    LOANED("Loaned"),
    RETURNED("Returned");
    
    private String loanStatus;
    LoanStatus(String loanStatus)
    {
        this.loanStatus = loanStatus;
    }
    
    public String getLoanStatus()
    {
        return loanStatus;
    }
}
