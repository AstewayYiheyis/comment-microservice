package com.edu.miu.eaproject.commentservice.service;

import com.edu.miu.eaproject.commentservice.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CommentServiceUserProxy implements CommentServiceUser{
    @Autowired
    RestTemplate restTemplate;

    String userUrl = "localhost:8081/users/{id}";



    @Override
    public User getUser(Long id) {
        User user = restTemplate.getForObject(userUrl, User.class, id);

        return user;
    }
}
