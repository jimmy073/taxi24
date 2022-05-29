package taxi24.jim.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taxi24.jim.server.entities.Driver;
import taxi24.jim.server.repo.DriverRepository;

import java.util.List;

@Service
public class DriverService {
    @Autowired
    protected DriverRepository driverRepository;

    public Driver findById(int id){
        return driverRepository.findById(id).orElse(null);
    }

    public List<Driver> findAllDrivers() {
        return driverRepository.findAll();
    }
}
