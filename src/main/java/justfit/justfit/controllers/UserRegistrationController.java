package justfit.justfit.controllers;


import justfit.justfit.Services.AccountingService;
import justfit.justfit.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserRegistrationController {

    @Autowired
    private AccountingService accountingService;

    @PostMapping("/add")
    public ResponseEntity create(@RequestBody Users users){
        try{
            Users added=accountingService.registerUser(users);
            return new ResponseEntity(added, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>("errore", HttpStatus.BAD_REQUEST);
        }
    }



}