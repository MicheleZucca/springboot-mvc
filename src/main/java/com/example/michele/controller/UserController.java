package com.example.michele.controller;
import com.example.michele.DTO.RTO.UserRTO;
import com.example.michele.DTO.TO.UserTO;
import com.example.michele.Service.UserService;
import com.example.michele.exception.UserError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    UserError userError;

    @PostMapping(path="/create-new-user")
    public ResponseEntity<Long> createNewUser(@RequestBody UserTO userTO){
        return new ResponseEntity<>(userService.newUser(userTO), HttpStatus.OK);
    }

    @GetMapping(path = "/get-user/{id}")
    public ResponseEntity<UserRTO> getUserFromId(Long id){
        userError.UserExistById(id);
        return new ResponseEntity<>(userService.getUserFromId(id), HttpStatus.OK);
    }

}
