package com.example.michele.exception;

import com.example.michele.DTO.TO.UserTO;
import com.example.michele.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserError extends RuntimeException{
    @Autowired
    UserRepository userRepository;


    public void UserDataException(UserTO userTO){
        if (userTO.getName() == null){
            throw new Error("Inserire nome utente!");
        }
    }

    public void UserExistById(Long id){
        if (!userRepository.existsById(id)) {
            throw new Error("Utente inesistente!");
        }
    }

}
