import java.util.ArrayList;
import java.util.List;

public class UserProfile {
    //Properties
    private int id;
    private String fullName;
    private String phone;
    private String email;
    private String address;
    private List<Reservation> reservations;

    //Constructor
    public UserProfile() { }

    public UserProfile(String fullName, String phone, String email, String address) {
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    //Getters
    public int getId() {
        return id;
    }
    public String getFullName() {
        return fullName;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
    public String getAddress() {
        return address;
    }
    public List<Reservation> getReservations() { return reservations; }

    //Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAddress(String address) { this.address = address; }
    public void setReservations(List<Reservation> reservations) { this.reservations = reservations; }

    //toString
    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", fullName=" + fullName +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    //add reservations
    public void addReservation(Reservation reservation){
        if (reservations == null){
            reservations = new ArrayList<Reservation>();
        }
        reservations.add(reservation);
        reservation.setUserProfile(this);
    }
}
