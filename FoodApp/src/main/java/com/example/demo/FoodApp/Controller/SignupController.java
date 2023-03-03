package com.example.demo.FoodApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.FoodApp.Entity.SignupEntity;
import com.example.demo.FoodApp.Service.SignupService;

@RestController
public class SignupController {
	@Autowired
	private SignupService ss;
	@GetMapping("/signup")
	public List <SignupEntity> getSignupDetails(){
		return ss.getDetail();
	}
	@PostMapping("/signuppost")
	public void saveDetails(@RequestBody SignupEntity se) {
		ss.saveDetail(se);
	}
	@PutMapping("/signupput")
	public void updateDetails(@RequestBody SignupEntity se,@RequestParam int userId) {
		se.setUserId(userId);
		ss.updateDetail(se);
	}
	@DeleteMapping("/signupdel")
	public void deleteDetail(int userId) {
		ss.deleteDetails(userId);
	}
}
