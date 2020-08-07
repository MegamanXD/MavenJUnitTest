public class User {
    //Properties
    private int id;
    private String userName;
    private String password;
    private String role;

    //Constructors
    public User() { }

    public User(String userName, String password, String role, UserProfile userProfile) {
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    //Getters
    public int getId() {
        return id;
    }
    public String getUserName() {
        return userName;
    }
    public String getPassword() { return password; }
    public String getRole() { return role; }


    //Setters
    public void setId(int id) { this.id = id; }
    public void setUserName(String userName) { this.userName = userName; }
    public void setPassword(String password) { this.password = password; }
    public void setRole(String role) { this.role = role; }

    //toString
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
