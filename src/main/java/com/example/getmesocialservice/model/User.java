package com.example.getmesocialservice.model;

import org.springframework.data.annotation.Id;

public class User {

    @Id
    private String Id;
    private String name;
    private String address;
    private int age;
    private String profilePicUrl;

    /*
    Constructor for User class with @param String name, String address, int age, String profilePicUrl
     */
    public User(String name, String address, int age, String profilePicUrl) {


        this.name = name;
        this.address = address;
        this.age = age;
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

//    public String getProfilePicUrl() {
//        return profilePicUrl;
//    }
//
//    public void setProfilePicUrl(String profilePicUrl) {
//        this.profilePicUrl = profilePicUrl;
//    }
}
