package com.jwd.controller.entity;

public class User {
    private static long idCounter = 111111L;
    private final long id;
    private String login;
    private String password;
    private String role;  //todo: enum

    public User(String login, String password) {
        this.id = ++idCounter;
        this.login = login;
        this.password = password;
        this.role = "signedUpUser";
    }

    public User(String login, String password, boolean isAdmin) {
        this.id = ++idCounter;
        this.login = login;
        this.password = password;
        this.role = "admin";
    }

    public long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        return password != null ? password.equals(user.password) : user.password == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User[" +
                "id=" + id +
                ", login='" + login +
                ", password='" + password + ']';
    }
}
