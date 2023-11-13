package com.example.michele.Service;

import com.example.michele.DTO.RTO.UserRTO;
import com.example.michele.DTO.TO.UserTO;
import com.example.michele.Entity.User;
import com.example.michele.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public Long newUser(UserTO user){
        User newUser = new User();
        newUser.setName(user.getName());
        newUser.setSurname(user.getSurname());
        newUser.setEmail(user.getEmail());
        return userRepository.save(newUser).getId();
    }

    public UserRTO getUserFromId(Long id){
        return userRepository.getUserRtoFromId(id);
    }
}
