package com.caching.example.microservicescaching.controller;

import com.caching.example.microservicescaching.model.response.userdetailsresponse.UsersDetailsResponse;
import com.caching.example.microservicescaching.service.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    @Autowired
    private UserDetails users;
    @GetMapping("/v1/getUsers")
    public UsersDetailsResponse getUserDetails() throws Exception {

        return users.getUserDetails();
    }
}
