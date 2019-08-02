package com.tedu.sp01.pojo;

import java.util.List;

public class Order {
	private String id;
	private User user;
	private List<Item> items;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	public Order() {
	}
	public Order(String id) {
		super();
		this.id = id;
	}
	public Order(String id, User user) {
		super();
		this.id = id;
		this.user = user;
	}
	public Order(String id, User user, List<Item> items) {
		super();
		this.id = id;
		this.user = user;
		this.items = items;
	}
	
}
