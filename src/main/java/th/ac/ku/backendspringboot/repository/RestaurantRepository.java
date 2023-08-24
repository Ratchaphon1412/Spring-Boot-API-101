package th.ac.ku.backendspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.ac.ku.backendspringboot.entity.Restaurant;

import java.util.List;
import java.util.UUID;

public interface RestaurantRepository extends JpaRepository<Restaurant, UUID> {

    Restaurant findByName(String name);
    List<Restaurant> findByLocation(String location);

}

