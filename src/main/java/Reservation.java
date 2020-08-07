import java.util.Date;

public class Reservation {
    //Properties
    private int id;
    private String name;
    private Date dateTime;
    private String status;
    private UserProfile userProfile;
    
    //Constructors
    public Reservation() { }

    public Reservation(String name, Date dateTime, String status) {
        this.name = name;
        this.dateTime = dateTime;
        this.status = status;
    }

    //Getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Date getDateTime() { return dateTime; }
    public String getStatus() {
        return status;
    }
    public UserProfile getUserProfile() { return userProfile; }

    //Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    //toString
    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", reservationName1='" + name + '\'' +
                ", userProfile=" + userProfile +
                ", dateTime=" + dateTime +
                ", status='" + status + '\'' +
                '}';
    }
}