package com.mycompany.library;

public class User {
    /* NOTE: The id_user existence check's must be does in the Class which 
    create a new User instance. Before specify 'id_user' local variable into 
    'User' Constructor, must be does if this 'id_user' already exists in the 
    User ArrayList. If not there it, could be specified in the Constructor */
    
    private final int id_user;
    private final String name;
    private UserType userType;
    
    public User(int id_user, String name, UserType userType)
    {
        this.id_user = id_user;
        this.name = name;
        this.userType = userType;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getId()
    {
        return id_user;
    }
    
    public UserType getUserType()
    {
        // NOTE: this method only could return the ENUM constant of instance 
        return userType;
    }
    
    public String toString()
    {
        return String.format("NAME: %s%nPOSITION: %s%nID: %d%n",
        name, userType.getUserType(), id_user);
    }
}
