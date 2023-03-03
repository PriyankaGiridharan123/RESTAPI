package com.example.demo.FoodApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.FoodApp.Entity.LoginEntity;

public interface LoginRepo extends JpaRepository<LoginEntity, Integer> {

}
