package com.sboot.ItemMgt.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
	@Id
	private int itemNo;
	private String itemName;
	private float itemCost;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int itemNo, String itemName, float itemCost) {
		super();
		this.itemNo = itemNo;
		this.itemName = itemName;
		this.itemCost = itemCost;
	}
	public int getItemNo() {
		return itemNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getItemCost() {
		return itemCost;
	}
	public void setItemCost(float itemCost) {
		this.itemCost = itemCost;
	}
	
}
