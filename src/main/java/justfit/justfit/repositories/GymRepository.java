package justfit.justfit.repositories;

import justfit.justfit.entities.Gym;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GymRepository extends JpaRepository<Gym,Integer> {

    boolean existsByNameAndCity(String name, String city);
}
