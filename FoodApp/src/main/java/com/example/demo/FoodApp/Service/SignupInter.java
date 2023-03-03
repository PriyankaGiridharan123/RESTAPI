package com.example.demo.FoodApp.Service;

import java.util.List;

import com.example.demo.FoodApp.Entity.SignupEntity;

public interface SignupInter {
public List <SignupEntity> getDetail();
public void saveDetail(SignupEntity se);
public void updateDetail(SignupEntity se);
public void deleteDetails(int userId);
}
