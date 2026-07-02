package com.example;



/**
 * User Model - Represents a user in the system.
 * In production, credentials would be loaded from a database.
 */
public class User {

    private String username;
    private String password;

    // Constructor
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter for username
    public String getUsername() {
        return username;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    /**
     * Validates credentials against hardcoded demo values.
     * Replace this logic with database lookup in production.
     */
    public boolean validate() {
        return username.equals("admin") && password.equals("password123");
    }
}
