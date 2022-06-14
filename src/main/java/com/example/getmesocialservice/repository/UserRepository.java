package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    List<User> userList = new ArrayList();

    public User getUser() {
        return new User("Ababiya Aba Abajobir", "123 Mart rd, Heaven, Galaxy", 200, "myPic2022.com");
    }

    public User saveUser(User u) {
        userList.add(u);
        return u;
    }
}
