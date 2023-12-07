package com.example.michele.Repository;

import com.example.michele.Entity.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApartementRepository extends JpaRepository<Apartment, Long> {
}
