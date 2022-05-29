package taxi24.jim.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import taxi24.jim.server.entities.Driver;
import taxi24.jim.server.service.DriverService;

import java.util.List;

@RestController
@RequestMapping("/api/drivers")
public class DriverApiController {
    @Autowired protected DriverService driverService;

    @GetMapping("/all")
    public List<Driver> getAllDrivers(){
        return driverService.findAllDrivers();
    }

    @GetMapping("/{id}")
    public Driver getDriver(@PathVariable int id){
        return driverService.findById(id);
    }
}
