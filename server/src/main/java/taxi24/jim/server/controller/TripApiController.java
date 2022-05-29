package taxi24.jim.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import taxi24.jim.server.entities.Trip;
import taxi24.jim.server.service.TripService;

import java.util.List;

@RestController
@RequestMapping("/api/trips")
public class TripApiController {
    @Autowired protected TripService tripService;

    @PostMapping("/create/{riderId}/{driverId}")
    public ResponseEntity<?> tripCreation(@PathVariable int riderId, @PathVariable int driverId){
        Trip trip = tripService.createTrip(riderId,driverId);
        return new ResponseEntity<Trip>(trip, HttpStatus.OK);
    }

    @GetMapping("/active")
    public List<Trip> getActiveTrips(){
        return tripService.findActiveTrips();
    }

    @PutMapping("/complete/{id}")
    public Trip completeTrip(@PathVariable int id){
        return tripService.completeTrip(id);
    }
}
