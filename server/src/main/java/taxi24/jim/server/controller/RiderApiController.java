package taxi24.jim.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import taxi24.jim.server.entities.Driver;
import taxi24.jim.server.entities.Rider;
import taxi24.jim.server.service.RiderService;

import java.util.List;

@RestController
@RequestMapping("/api/riders")
public class RiderApiController {
    @Autowired protected RiderService riderService;

    @GetMapping("/all")
    public List<Rider> getAllDrivers(){
        return riderService.findAllRiders();
    }

    @GetMapping("/find/{riderId}")
    public Rider getRider(@PathVariable int riderId){
        return riderService.getRider(riderId);
    }
}
