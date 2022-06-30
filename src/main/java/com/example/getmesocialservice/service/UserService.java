package com.example.getmesocialservice.service;

import com.example.getmesocialservice.model.User;
import com.example.getmesocialservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service //Object already created and doesn't need to be created new object
public class UserService {

    @Autowired
    private UserRepository uRepo;


    public User getUser() {
        return uRepo.getUser();
    }

    public User saveUser(User u) {
        return uRepo.saveUser(u);
    }

    public List<User> getAllUsers() {
        return uRepo.getAllUsers();
    }

    public User getUserById(int userId) {
        return uRepo.getUserById(userId);
    }

    public User updateUser(int userId, User u) {
        return uRepo.updateUser(userId, u);
    }

    public User deleteUser(int userID) {
        return uRepo.deleteUser(userID);
    }
}
