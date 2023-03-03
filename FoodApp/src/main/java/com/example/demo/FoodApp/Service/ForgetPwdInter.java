package com.example.demo.FoodApp.Service;

import java.util.List;

import com.example.demo.FoodApp.Entity.ForgetPwdEntity;

public interface ForgetPwdInter {
	public List <ForgetPwdEntity> getDetail();
	public void saveDetails(ForgetPwdEntity fe);
}
