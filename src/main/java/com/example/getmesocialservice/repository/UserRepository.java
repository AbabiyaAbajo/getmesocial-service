package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User getUser() {
        return new User("Ababiya Aba Abajobir", "123 Mart rd, Heaven, Galaxy", 200, "myPic2022.com");
    }

}
