package com.caching.example.microservicescaching.service;

import com.caching.example.microservicescaching.model.response.userdetailsresponse.UsersDetailsResponse;

public interface UserDetails {
    UsersDetailsResponse getUserDetails() throws Exception;
}
