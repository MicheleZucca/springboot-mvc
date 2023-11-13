package com.example.michele;

import com.example.michele.DTO.RTO.UserRTO;
import com.example.michele.Entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = {})
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserRTO userRTOfromUserEntity(User source);
}
