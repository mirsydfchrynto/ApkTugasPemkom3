package app.serialization;

import java.io.Serializable;

public class User implements Serializable{ 
    String username; 
    String password; 
 
    public User(String name, String pass) { 
        this.username = name; 
        this.password = pass; 
    } 
 
    @Override 
    public String toString() { 
        return "\r\nUsername=" + username + "\r\nPassword=" + password + "\r\n"; 
    }     
}