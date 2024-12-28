package com.example.samuraitravel.repository.java;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samuraitravel.entity.Role;

 
 public interface RoleRepository extends JpaRepository<Role, Integer> {
     public Role findByName(String name);    

}