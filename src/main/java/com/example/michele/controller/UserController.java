package com.example.michele.controller;
import com.example.michele.DTO.RTO.UserRTO;
import com.example.michele.DTO.TO.UserTO;
import com.example.michele.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(path="/create-new-user")
    public ResponseEntity<Long> createNewUser(@RequestBody UserTO userTO){
        return new ResponseEntity<>(userService.newUser(userTO), HttpStatus.OK);
    }

    @GetMapping(path = "/get-user/{id}")
    public ResponseEntity<UserRTO> getUserFromId(Long id){
        return new ResponseEntity<>(userService.getUserFromId(id), HttpStatus.OK);
    }

}
