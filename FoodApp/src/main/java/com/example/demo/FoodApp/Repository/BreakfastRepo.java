package com.example.demo.FoodApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.FoodApp.Entity.BreakfastEntity;
@Repository
public interface BreakfastRepo extends JpaRepository<BreakfastEntity, Integer> {

}
