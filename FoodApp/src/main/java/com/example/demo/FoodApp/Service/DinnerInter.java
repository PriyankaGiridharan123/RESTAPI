package com.example.demo.FoodApp.Service;

import java.util.List;

import com.example.demo.FoodApp.Entity.DinnerEntity;

public interface DinnerInter {
		public List<DinnerEntity> getDetail();
		public List<DinnerEntity> findByFoodnameOrQuantity(String foodname,int quantity);
		public void saveDetails(DinnerEntity de);
		public void deleteDetail(int orderno);
	}
