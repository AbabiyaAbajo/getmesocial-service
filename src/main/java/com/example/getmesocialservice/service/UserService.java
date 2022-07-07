package com.example.getmesocialservice.service;

import com.example.getmesocialservice.model.User;

import com.example.getmesocialservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service //Object already created and doesn't need to be created new object
public class UserService {

    @Autowired
    private UserRepository uRepo;

    public User saveUser(User u) {
        return uRepo.save(u);
    }

    public List<User> getAllUsers() {
        return uRepo.findAll();
    }

    public User updateUser(User u) {
        return uRepo.save(u);
    }

    public void deleteUser(String userId) {
        uRepo.deleteById(userId);
    }

    public List<User> getByAddress(String address) {
        return uRepo.findAllByAddress(address);
    }

    public Optional<User> getUserById(String userId) {
        return uRepo.findById(userId);
    }

//    public User getUser() {
//        return uRepo.getUser();
//    }

}
