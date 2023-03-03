package com.example.demo.FoodApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.FoodApp.Entity.BreakfastEntity;
import com.example.demo.FoodApp.Service.BreakfastService;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BreakfastController {
	@Autowired
	private BreakfastService bs;
	@GetMapping("/Breakfast")
	public List<BreakfastEntity> getBreakfastDetails(){
		return bs.getDetail();
	}
	@PostMapping("/breakfastpost")
	public void saveDetail(@RequestBody BreakfastEntity be) {
		bs.saveDetail(be);
	}
	@DeleteMapping("/breakfastdel")
	public void deleteDetail(int id) {
		bs.deleteDetail(id);
	}

}
