package com.example.getmesocialservice.model;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class User {

    @Id
    private String Id;
    @NotEmpty
    private String name;
    @Length(max = 10)
    private String address;
    @Min(value = 13) @Max(value = 99)
    private int age;
    @Email()
    private String email;
    @NotEmpty
    private String profilePicUrl;

    public User(@NotEmpty String name, @Length(max = 10) String address, @Min(value = 13) @Max(value = 99) int age, @Email() String email, @NotEmpty String profilePicUrl) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.email = email;
        this.profilePicUrl = profilePicUrl;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }


}
