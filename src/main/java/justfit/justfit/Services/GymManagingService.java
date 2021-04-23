package justfit.justfit.Services;

import justfit.justfit.entities.Gym;
import justfit.justfit.repositories.GymRepository;
import justfit.justfit.UTI.Exception.GymAlreadyExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
public class GymManagingService {

    @Autowired
    private GymRepository gymRepository;

    @Transactional
    public Gym registerGym(Gym gym)throws Exception {
        /*
        TODO controlli su i dati inseriti
        */
        if(gymRepository.existsByNameAndCity(gym.getName(),gym.getCity())){
            throw new GymAlreadyExistException();
        }
        return gymRepository.save(gym);
    }
}
