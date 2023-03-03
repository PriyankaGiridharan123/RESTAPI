package com.example.demo.FoodApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.FoodApp.Entity.LoginEntity;
import com.example.demo.FoodApp.Repository.LoginRepo;
@Service
public class LoginService implements LoginInter {
	@Autowired
	private LoginRepo lr;
	public List <LoginEntity> getDetail(){
		return lr.findAll();
	}
	@Override
	public void saveDetails(LoginEntity le) {
		lr.save(le);
		
	}
	@Override
	public void updateDetails(LoginEntity le) {
		lr.save(le);
		
	}
	@Override
	public void deleteDetails(int id) {
		lr.deleteById(id);
		
	}
}

