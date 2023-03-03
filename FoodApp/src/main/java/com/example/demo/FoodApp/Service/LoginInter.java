package com.example.demo.FoodApp.Service;

import java.util.List;

import com.example.demo.FoodApp.Entity.LoginEntity;

public interface LoginInter {
public List <LoginEntity> getDetail();
public void saveDetails(LoginEntity le);
public void updateDetails(LoginEntity le);
public void deleteDetails(int id);
}
