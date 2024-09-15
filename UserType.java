package com.mycompany.library;

public enum UserType {
    STUDENT("Student"),
    TEACHER("Teacher");
    
    private String userType;
    UserType(String userType)
    {
        this.userType = userType;
    }
    
    public String getUserType()
    {
        return userType;
    }
}
