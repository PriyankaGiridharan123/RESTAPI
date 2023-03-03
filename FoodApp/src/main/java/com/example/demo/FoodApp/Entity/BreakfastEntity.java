package com.example.demo.FoodApp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="breakfast2")
public class BreakfastEntity {
	@Id
	private int id;
	public BreakfastEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BreakfastEntity(int id, String name, String orders, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.orders = orders;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrders() {
		return orders;
	}
	public void setOrders(String orders) {
		this.orders = orders;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	private String name;
	private String orders;
	private int quantity;
}