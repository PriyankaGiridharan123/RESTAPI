package com.example.demo.FoodApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.FoodApp.Entity.BreakfastEntity;
import com.example.demo.FoodApp.Repository.BreakfastRepo;
@Service
public class BreakfastService implements BreakfastInter {
@Autowired
private BreakfastRepo br;
public List<BreakfastEntity> getDetail(){
	return br.findAll();
}
public void deleteDetail(int id) {
	br.deleteById(id);
}
@Override
public void saveDetail(BreakfastEntity be) {
	br.save(be);
	
}
}  