package com.caching.example.microservicescaching.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserDetailsImpl implements UserDetails{
    @Autowired
    private RestTemplate template;
    @Override
    public String getUserDetails() throws Exception {
        template.exchange("https://reqres.in/api/users", HttpMethod.GET, getHttpEntity(), String.class);
        return null;
    }

    private HttpEntity getHttpEntity() {
        HttpEntity<> entity = new HttpEntity();
        return entity;
    }
}
