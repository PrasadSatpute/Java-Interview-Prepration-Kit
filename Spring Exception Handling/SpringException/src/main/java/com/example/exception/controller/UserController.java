package com.example.exception.controller;

import com.example.exception.cutome_response.ResponseHandler;
import com.example.exception.dao.User;
import com.example.exception.exception.CustomExceptionNameNotFound;
import com.example.exception.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user)
    {
        try {
            userService.addUser(user);
            return ResponseEntity.ok(user);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/getUserByName/{name}")
    public ResponseEntity<Object> getUserByName(@PathVariable String name) throws CustomExceptionNameNotFound {
        return ResponseHandler.customeResponseEntity("Name Found",HttpStatus.OK,userService.getUserByName(name));
    }

    @PutMapping("/updateUser")
    public ResponseEntity<User> updateUse(@RequestBody User user)
    {
        try {
            userService.updateUser(user);
            return ResponseEntity.ok(user);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping("/deleteUser/{name}")
    public String deleteUser(@PathVariable String name)
    {
        if (userService.deleteUser(name))
        {
            return "User deleted Successfully :- "+name;
        }
        return "Not Found";
    }

    @GetMapping("/getAllUser")
    public ResponseEntity<List<User>> getAllUsers()
    {
        return ResponseEntity.ok(userService.getAllUserList());
    }

}
