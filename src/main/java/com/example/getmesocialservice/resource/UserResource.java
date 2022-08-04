package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.exception.RestrictedInfoException;
import com.example.getmesocialservice.model.User;
import com.example.getmesocialservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;


@RestController  //Spring will understand that there are rest endpoint here
@RequestMapping("/api/user") //endpoint path. Methods will start with server/api. (Example: http://localhost:8080/api/user)
public class UserResource {

    @Autowired //Connection between autowired and service. We wont be initializing this object. Spring will do it.
    private UserService uService;

    /*
    @RequestBody, lets us know that we need to parameters to be provided by the user and this will be provided in the
    format of a User.

    Function returns the response to the POST request. We can see that this is a post request by the PostMapping annotation.
     */
    @PostMapping
    public User saveUser(@RequestBody @Valid User u) throws RestrictedInfoException {
        if(u.getName().equalsIgnoreCase("root")){
            throw new RestrictedInfoException();
        }
        return uService.saveUser(u);
    }

    /*
    Cant use get with /user since there's another get method using it right now
    */
    @GetMapping
    public List<User> getAllUsers(){
        return uService.getAllUsers();
    }

    @GetMapping("/findByAddress")
    public List<User> getByAddress(@RequestParam(name = "address") String address) throws RestrictedInfoException {
        if(address.equalsIgnoreCase("ethiopia")){
            throw new RestrictedInfoException();
        }
        return uService.getByAddress(address);
    }


    @GetMapping("/finById")
    public User getUserById(@RequestParam(name = "userId") String userId) throws RestrictedInfoException {
        User u = uService.getUserById(userId);
        if(u.getName().equalsIgnoreCase("root")){
            throw new RestrictedInfoException();
        }
        return u;
    }


    @PutMapping
    public User updateUser(@RequestBody @Valid User u){
        return uService.updateUser(u);
    }

    @DeleteMapping
    public void deleteUser(@RequestParam(name = "User ID") String userID) {
        uService.deleteUser(userID);
    }

//    /*
//        Function to return a user.
//        We using the GetMapping annotation for the rest api.
//     */
//    @GetMapping("/user")
//    public User getUser() {
//        return uService.getUser();
//    }


//    @GetMapping("/user/{userId}")
//    public User getUserById(@PathVariable("userId") int userId){
//        return uService.getUserById(userId);
//    }



}
