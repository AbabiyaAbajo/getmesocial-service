package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.model.User;
import com.example.getmesocialservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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


    /*
    @RequestBody, lets us know that we need to parameters to be provided by the user and this will be provided in the
    format of a User.

    Function returns the response to the POST request. We can see that this is a post request by the PostMapping annotation.
     */
    @PostMapping("/user")
    public User saveUser(@RequestBody User u) {
        return uService.saveUser(u);
    }


    /*
    Cant use get with /user since there's another get method using it right now
    */
    @GetMapping("/allUsers")
    public List<User> getAllUsers(){
        return uService.getAllUsers();
    }

    @GetMapping("/user/{userId}")
    public User getUserById(@PathVariable("userId") int userId){
        return uService.getUserById(userId);
    }

    @PutMapping("/user/{userId}")
    public User updateUser(@PathVariable("userId") int userId, @RequestBody User u){
        return uService.updateUser(userId, u);
    }

    @DeleteMapping("/user")
    public User deleteUser(@RequestParam(name = "user") int userID) {
        return uService.deleteUser(userID);
    }
}
