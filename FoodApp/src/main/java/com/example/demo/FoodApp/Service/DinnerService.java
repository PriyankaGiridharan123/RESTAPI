package com.example.demo.FoodApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.FoodApp.Entity.DinnerEntity;
import com.example.demo.FoodApp.Repository.DinnerRepo;
@Service
public class DinnerService implements DinnerInter {
	@Autowired
	private DinnerRepo dr;
	public List<DinnerEntity> getDetail(){
		return dr.findAll();
	}

	@Override
	public List<DinnerEntity> findByFoodnameOrQuantity(String foodname,int quantity) {
		
		return dr.findByFoodnameOrQuantity(foodname,quantity);
	}
	public void saveDetails(DinnerEntity de) {
		dr.save(de);
	}
	public void deleteDetail(int orderno) {
		dr.deleteById(orderno);
	}
}
