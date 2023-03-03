package com.example.demo.FoodApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.FoodApp.Entity.SignupEntity;
@Repository
public interface SignupRepo extends JpaRepository<SignupEntity, Integer> {

}
