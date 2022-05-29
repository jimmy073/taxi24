package taxi24.jim.server.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import taxi24.jim.server.entities.Rider;

public interface RiderRepo extends JpaRepository<Rider, Integer> {
}
