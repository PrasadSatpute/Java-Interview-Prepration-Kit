package com.example.jwt.service;
import com.example.jwt.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Service
public class UserService {
    public List<User> users = new ArrayList<>();

    public UserService(){
        users.add(new User(UUID.randomUUID().toString(),"ABC","ABC@gmail.com"));
        users.add(new User(UUID.randomUUID().toString(),"PQR","PQR@gmail.com"));
        users.add(new User(UUID.randomUUID().toString(),"XYZ","XYZ@gmail.com"));
        users.add(new User(UUID.randomUUID().toString(),"123","123@gmail.com"));
    }
    public List<User> getUsers() {
        return this.users;
    }
}
