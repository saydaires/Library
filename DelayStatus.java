package com.mycompany.library;

public enum DelayStatus {
    REGULATE("Regulate"),
    DELAYED("Delayed");
    
    private String delayStatus;
    DelayStatus(String delayStatus)
    {
        this.delayStatus = delayStatus;
    }
    
    public String getDelayStatus()
    {
        return delayStatus;
    }
}
