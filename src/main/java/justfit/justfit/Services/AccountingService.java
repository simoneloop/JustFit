package justfit.justfit.Services;

import justfit.justfit.entities.Users;
import justfit.justfit.repositories.UserRepository;
import justfit.justfit.UTI.Exception.EmailAlreadyExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class AccountingService {

    @Autowired
    private UserRepository userRepository;


    @Transactional
    public Users registerUser(Users users) throws Exception {
        /*
            TODO controlli su i dati inseriti
         */
        if(userRepository.existsByEmail(users.getEmail())){
            throw new EmailAlreadyExistException();
        }
        return userRepository.save(users);
    }
}
