package com.example.demo.FoodApp.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.FoodApp.Entity.MenuEntity;
@Service
public class MenuService implements MenuInter {
	private static List<MenuEntity> ldm=new ArrayList<>();
	static {
		MenuEntity dm=new MenuEntity("Dosa","Meals","Butter Naan","Meen Kolambu","Allu paratta","Pasta","Szechuan Rice","Badam Halwa");
        ldm.add(dm);
	}
	public List<MenuEntity> getDetail(){
		return ldm;
	}
}