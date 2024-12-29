package com.example.samuraitravel.repository;

 import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samuraitravel.entity.Reservation;

 public interface ResevationRepository extends JpaRepository<Reservation, Integer> {

}