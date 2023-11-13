package com.example.michele.Repository;

import com.example.michele.DTO.RTO.UserRTO;
import com.example.michele.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select new com.example.michele.DTO.RTO.UserRTO(user.id, user.name, user.surname, user.email) from User user " +
            "where user.id = :id")
    UserRTO getUserRtoFromId(@Param("id") Long id);
}
