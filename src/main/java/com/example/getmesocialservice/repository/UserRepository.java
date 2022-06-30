package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.User;
import com.example.getmesocialservice.service.UserService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    List<User> userList = new ArrayList();

    public User getUser() {
        return new User("Ababiya Aba Abajobir", "123 Mart rd, Heaven, Galaxy", 200, "myPic2022.com");
    }

    /*
    Saving a new user. We're also incrementing the userID by using the number of users +1
     */
    public User saveUser(User u) {
        u.setUserId(userList.size()+1);
        userList.add(u);
        return u;
    }


    public List<User> getAllUsers() {
        return userList;
    }

    public User getUserById(int userId) {
        for(User u:userList) {
            if(u.getUserId() == userId)
                return u;
        }
        return null;
    }

    public User updateUser(int userId, User u) {
        for(User us: userList)
            if(us.getUserId() == userId){
                us.setName(u.getName());
                us.setAddress(u.getAddress());
                us.setAge(u.getAge());
                us.setProfilePicUrl(u.getProfilePicUrl());
                return u;
            }

        return null;
    }

    public User deleteUser(int userId) {
        User deleteUser = null;
        for(User u:userList)
            if(u.getUserId() == userId) {
                deleteUser = u;
                userList.remove(u);
                return deleteUser;
            }
        return deleteUser;
    }
}
