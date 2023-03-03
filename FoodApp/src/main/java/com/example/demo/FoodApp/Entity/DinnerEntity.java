package com.example.demo.FoodApp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="dinner1")
public class DinnerEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderno;
	private String foodname;
	private int quantity;
	private double price;
	private String timing;
	private String combo;
	private double comboPrice;
	private String comboOffer;
	public DinnerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DinnerEntity(int orderno, String foodname, int quantity, double price, String timing, String combo,
			double comboPrice, String comboOffer) {
		super();
		this.orderno = orderno;
		this.foodname = foodname;
		this.quantity = quantity;
		this.price = price;
		this.timing = timing;
		this.combo = combo;
		this.comboPrice = comboPrice;
		this.comboOffer = comboOffer;
	}
	public int getOrderno() {
		return orderno;
	}
	public void setOrderno(int orderno) {
		this.orderno = orderno;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	public String getCombo() {
		return combo;
	}
	public void setCombo(String combo) {
		this.combo = combo;
	}
	public double getComboPrice() {
		return comboPrice;
	}
	public void setComboPrice(double comboPrice) {
		this.comboPrice = comboPrice;
	}
	public String getComboOffer() {
		return comboOffer;
	}
	public void setComboOffer(String comboOffer) {
		this.comboOffer = comboOffer;
	}
	
	
}
