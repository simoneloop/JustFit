package justfit.justfit.controllers;


import justfit.justfit.Services.GymManagingService;
import justfit.justfit.entities.Gym;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gym")
public class GymRegistrationController {

    @Autowired
    private GymManagingService gymManagingService;

    @PostMapping("/add")
    public ResponseEntity add(Gym gym){
        try{
            Gym added= gymManagingService.registerGym(gym);
            return new ResponseEntity(added, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }
}
