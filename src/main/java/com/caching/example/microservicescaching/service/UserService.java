package com.caching.example.microservicescaching.service;

import com.caching.example.microservicescaching.dto.UserDto;
import com.caching.example.microservicescaching.model.response.UserResponse;
import com.caching.example.microservicescaching.model.response.userdetailsresponse.UsersDetailsResponse;

import java.util.List;

public interface UserService {
    UsersDetailsResponse getUserDetails() throws Exception;

    UserResponse addUser(UserDto userDto) throws Exception;

    UserResponse getUser(Integer userId) throws Exception;

    void deleteUser(Integer userId) throws Exception;

    List<UserResponse> allUsers(Integer page) throws Exception;
}
