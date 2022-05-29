package taxi24.jim.server.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import taxi24.jim.server.entities.Driver;

public interface DriverRepository extends JpaRepository<Driver, Integer> {
}
