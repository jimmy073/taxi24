package taxi24.jim.server.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import taxi24.jim.server.entities.Trip;
import taxi24.jim.server.enums.GenericStatus;

import java.util.List;

public interface TripRepo extends JpaRepository<Trip, Integer> {
    List<Trip> findByStatus(GenericStatus status);
}
