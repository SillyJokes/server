package server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JokeController {
    @GetMapping("/home")
    public String getHome(){
        return "I've got you covered!";
    }
    @GetMapping("/error")
    public String getError(){
        return "Sorry there is an error";
    }
}
