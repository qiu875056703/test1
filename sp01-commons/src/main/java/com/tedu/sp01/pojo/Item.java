package com.tedu.sp01.pojo;


public class Item {
	private Integer id;
	private String name;
	private Integer number;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public Item() {
	}
	public Item(Integer id) {
		super();
		this.id = id;
	}
	public Item(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Item(Integer id, String name, Integer number) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
	}
	
}
