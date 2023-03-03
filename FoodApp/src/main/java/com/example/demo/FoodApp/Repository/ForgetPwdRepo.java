package com.example.demo.FoodApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.FoodApp.Entity.ForgetPwdEntity;

public interface ForgetPwdRepo extends JpaRepository<ForgetPwdEntity, Integer> {

}
