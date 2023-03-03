package com.example.demo.FoodApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.FoodApp.Entity.ForgetPwdEntity;
import com.example.demo.FoodApp.Repository.ForgetPwdRepo;
@Service
public class ForgetPwdService implements ForgetPwdInter {
@Autowired
private ForgetPwdRepo fr;
	public List<ForgetPwdEntity> getDetail(){
		return fr.findAll();
	}

	@Override
	public void saveDetails(ForgetPwdEntity fe) {
		fr.save(fe);
		
	}
}
