package com.example.demo.FoodApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.FoodApp.Entity.LoginEntity;
import com.example.demo.FoodApp.Service.LoginService;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class LoginController {
	@Autowired
	private LoginService ls;
	@GetMapping("/login")
	public List<LoginEntity> getLoginDetails(){
		return ls.getDetail();
	}
	@PostMapping("/lpost")
	public void saveDetail(@RequestBody LoginEntity le) {
		ls.saveDetails(le);
	}
	@PutMapping("/lput")
	public void updateDetail(@RequestBody LoginEntity le,@RequestParam int id) {
		le.setId(id);
		ls.saveDetails(le);
	}
	@DeleteMapping("/ldel")
	public void deleteDetail(int id) {
		ls.deleteDetails(id);
	}
}
