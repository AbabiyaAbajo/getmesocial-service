package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.model.User;
import com.example.getmesocialservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController  //Spring will understand that there are rest endpoint here
@RequestMapping("/api") //endpoint path. Methods will start with server/api. (Example: http://localhost:8080/api/user)
public class UserResource {

    @Autowired //Connection between autowired and service. We wont be initializing this object. Spring will do it.
    private UserService uService;

    /*
        Function to return a user.
        We using the GetMapping annotation for the rest api.
     */
    @GetMapping("/user")
    public User getUser() {
        return uService.getUser();
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User u) {
        return uService.saveUser(u);
    }

}
