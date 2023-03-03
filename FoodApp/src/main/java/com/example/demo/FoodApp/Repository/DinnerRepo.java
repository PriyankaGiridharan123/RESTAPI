package com.example.demo.FoodApp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.FoodApp.Entity.DinnerEntity;

public interface DinnerRepo extends JpaRepository<DinnerEntity, Integer> {
	public List<DinnerEntity> findByFoodnameOrQuantity(String foodname,int quantity);

}
