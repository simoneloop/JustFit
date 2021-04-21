package justfit.justfit.controllers;


import justfit.justfit.entities.Utente;
import justfit.justfit.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.persistence.*;

@RestController
@RequestMapping("/users")
public class Registration {

    @Autowired
    private UtenteRepository utenteRepository;

    @PostMapping("/add")
    public ResponseEntity add(@RequestBody Utente u){
        try{
           return new ResponseEntity(utenteRepository.save(u), HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }
}
