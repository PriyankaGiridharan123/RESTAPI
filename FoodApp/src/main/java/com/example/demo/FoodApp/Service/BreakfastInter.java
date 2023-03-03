package com.example.demo.FoodApp.Service;

import java.util.List;

import com.example.demo.FoodApp.Entity.BreakfastEntity;

public interface BreakfastInter {
public List<BreakfastEntity> getDetail();
public void saveDetail(BreakfastEntity be);
public void deleteDetail(int id);
}
