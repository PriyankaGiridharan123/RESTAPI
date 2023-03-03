package com.example.demo.FoodApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.FoodApp.Entity.ForgetPwdEntity;
import com.example.demo.FoodApp.Service.ForgetPwdService;

@RestController
public class ForgetPwdController {
	@Autowired
	private ForgetPwdService fs;
	@GetMapping("/ForgetPwd")
	public List<ForgetPwdEntity> getPasswordDetails(){
		return fs.getDetail();
	}
	@PostMapping("/ForgetPwdpost")
	public void saveDetail(@RequestBody ForgetPwdEntity fe) {
		fs.saveDetails(fe);
	}

}
