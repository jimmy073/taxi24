package taxi24.jim.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taxi24.jim.server.entities.Driver;
import taxi24.jim.server.entities.Rider;
import taxi24.jim.server.entities.Trip;
import taxi24.jim.server.enums.GenericStatus;
import taxi24.jim.server.repo.DriverRepository;
import taxi24.jim.server.repo.RiderRepo;
import taxi24.jim.server.repo.TripRepo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class TripService {
    @Autowired protected TripRepo tripRepository;
    @Autowired protected RiderRepo riderRepo;
    @Autowired protected DriverRepository driverRepository;

    public List<Trip> findAllTrips() {
        return tripRepository.findAll();
    }

    public List<Trip> findActiveTrips(){
        return tripRepository.findByStatus(GenericStatus.ACTIVE);
    }

    public Trip createTrip(int riderId, int driverId){
        Rider rider = riderRepo.findById(riderId).orElse(null);
        Driver driver = driverRepository.findById(driverId).orElse(null);
        if(rider!=null) {
            if (driver != null) {
             Trip trip = new Trip();
                trip.setRider(rider);
                trip.setDriver(driver);
                trip.setStatus(GenericStatus.ACTIVE);
                trip.setToLocation("riderwish");
                trip.setFromLocation("riderdecides");
                trip.setTripPrice(700);
                trip.setTripDate(LocalDate.now());
                trip.setTripTime(LocalDateTime.now());
                return tripRepository.save(trip);
            }}
        return null;
}
    public Trip completeTrip(int id){
        Trip trip = tripRepository.findById(id).orElse(null);
        if(trip !=null){
            trip.setStatus(GenericStatus.COMPLETED);
            return tripRepository.save(trip);
        }
        return null;
    }
}
