package employee_accounting.model;

public class User {
    public String username;
    public String hashedPassword;

    public String getUsername() {
        return username;
    }
    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public User(String username, String hashedPassword) {
        this.username = username;
        this.hashedPassword = hashedPassword;
    }
}