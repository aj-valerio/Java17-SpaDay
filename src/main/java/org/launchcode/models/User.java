package org.launchcode.models;

public class User {

    @NotBlank
    @Size(min = 3, max = 12)
    private String username;
    private String email;

    @NotBlank
    @Size(min = 6)
    private String password;
    private static int nextId = 1;
    private final int id;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.id = nextId;
        nextId++;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }
}
