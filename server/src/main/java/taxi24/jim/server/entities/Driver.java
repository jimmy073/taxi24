package taxi24.jim.server.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import taxi24.jim.server.enums.GenericStatus;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Driver {
    @Id
    @GeneratedValue
    private int id;
    private String names;
    private String telephone;
    @Enumerated(EnumType.STRING)
    private GenericStatus status;
    @OneToMany(mappedBy = "driver")
    @JsonIgnore
    private Set<Trip> trips;
    private String location;
    private String distance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public GenericStatus getStatus() {
        return status;
    }

    public void setStatus(GenericStatus status) {
        this.status = status;
    }

    public Set<Trip> getTrips() {
        return trips;
    }

    public void setTrips(Set<Trip> trips) {
        this.trips = trips;
    }

    public String getLocation() {
        return location;
    }

    public String getDistance() {
        return distance;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }
}
