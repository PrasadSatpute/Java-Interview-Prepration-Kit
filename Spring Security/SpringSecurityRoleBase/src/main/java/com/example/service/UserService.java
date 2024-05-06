package com.example.service;

import com.example.dao.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    public List<User> userList = new ArrayList<>();

    public UserService() {
        userList.add(new User("ABC","ABC","abc@gmail.com"));
        userList.add(new User("XYZ","XYZ","xyz@gmail.com"));
        userList.add(new User("PQR","PQR","pqr@gmail.com"));
        userList.add(new User("LMN","LMN","lmn@gmail.com"));
    }

    public List<User> getAllUserList()
    {
        return this.userList;
    }

    public User addUser(User user)
    {
        this.userList.add(user);
        return user;
    }

    public User getUserByName(String name)
    {
        return userList.stream().filter(usr -> usr.getUsername().equals(name)).findAny().get();
    }
}
