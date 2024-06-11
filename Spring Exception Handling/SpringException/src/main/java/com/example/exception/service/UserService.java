package com.example.exception.service;

import com.example.exception.advice.UserNotFoundException;
import com.example.exception.dao.User;
import com.example.exception.exception.CustomExceptionNameNotFound;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public User getUserByName(String name) throws CustomExceptionNameNotFound {
        try {
            return userList.stream().filter(usr -> usr.getUsername().equals(name)).findAny().get();
        } catch (Exception e) {
            throw new CustomExceptionNameNotFound("User not Found");
        }
    }

    public User updateUser(User user)
    {
        for (int i = 0; i < userList.size(); i++) {
            User usr = userList.get(i);
            if (usr.getUsername().equals(user.getUsername())) {
                userList.set(i, user);
                return usr;
            }
        }
        return null; // Return null if user not found
    }

    public boolean deleteUser(String name) {
        return userList.removeIf(user -> user.getUsername().equals(name));
    }
}
