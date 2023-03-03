package com.example.demo.FoodApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.FoodApp.Entity.MenuEntity;
import com.example.demo.FoodApp.Service.MenuService;

@RestController
public class MenuController {
	@Autowired
	private MenuService ms;
	@GetMapping("/Menu")
	public List<MenuEntity> getMenuDetails(){
		return ms.getDetail();
	}

}
