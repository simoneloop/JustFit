package justfit.justfit.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/test")
public class example {

    @GetMapping("/saluti")
    public String saluti(){
        return "helloWorld";
    }
}
