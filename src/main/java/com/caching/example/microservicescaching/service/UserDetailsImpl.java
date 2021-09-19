package com.caching.example.microservicescaching.service;

import com.caching.example.microservicescaching.model.response.userdetailsresponse.UsersDetailsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class UserDetailsImpl implements UserDetails {
    @Autowired
    private RestTemplate template;

    @Override
    public UsersDetailsResponse getUserDetails() throws Exception {
        ResponseEntity<UsersDetailsResponse> response = template.exchange("https://reqres.in/api/users",
                HttpMethod.GET, getHttpEntity(), UsersDetailsResponse.class);
        return response.getBody();
    }

    private HttpEntity getHttpEntity() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new HttpEntity<UsersDetailsResponse>(headers);
    }
}
