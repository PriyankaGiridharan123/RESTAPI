package com.example.demo.FoodApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.FoodApp.Entity.DinnerEntity;
import com.example.demo.FoodApp.Service.DinnerService;

@RestController
public class DinnerController {
	
	@Autowired
	private DinnerService ds;
	@GetMapping("/Dinner")
	public List<DinnerEntity> getDinnerDetails(){
		return ds.getDetail();
	}
	@PostMapping("/dinnerpost")
	public void saveDetail(@RequestBody DinnerEntity de) {
		ds.saveDetails(de);
	}
	@GetMapping("/dinnerget")
	public List<DinnerEntity> getDet(@RequestParam String foodname,@RequestParam int quantity){
		return ds.findByFoodnameOrQuantity(foodname,quantity);
	}
	@DeleteMapping("/dinnerdel")
	public void deleteDetail(int orderno) {
		ds.deleteDetail(orderno);
	}
}