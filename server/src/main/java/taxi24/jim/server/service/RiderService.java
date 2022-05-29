package taxi24.jim.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taxi24.jim.server.entities.Driver;
import taxi24.jim.server.entities.Rider;
import taxi24.jim.server.repo.RiderRepo;

import java.util.List;

@Service
public class RiderService {
    @Autowired protected RiderRepo riderRepository;

    public List<Rider> findAllRiders() {
        return riderRepository.findAll();
    }

    public Rider getRider(int riderId) {
        return riderRepository.findById(riderId).orElse(null);
    }
}
