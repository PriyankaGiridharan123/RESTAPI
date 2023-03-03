package com.example.demo.FoodApp.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.FoodApp.Entity.SignupEntity;
import com.example.demo.FoodApp.Repository.SignupRepo;

@Service

public class SignupService implements SignupInter {
@Autowired	
private SignupRepo sr;
public List <SignupEntity> getDetail(){
	return sr.findAll();
}

@Override
public void saveDetail(SignupEntity se) {
	sr.save(se);
	
}

@Override
public void updateDetail(SignupEntity se) {
	sr.save(se);
	
}

@Override
public void deleteDetails(int userId) {
	sr.deleteById(userId);
	
}
}
