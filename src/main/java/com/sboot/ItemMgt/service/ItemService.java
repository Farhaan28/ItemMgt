package com.sboot.ItemMgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sboot.ItemMgt.dao.ItemDao;
import com.sboot.ItemMgt.model.Item;

@Service
public class ItemService {
	@Autowired
	private ItemDao idao;
	
	public Item addItem(Item i) {
		return idao.save(i);
	}
	
	public Item getItem(int itemNo) {
		return idao.findById(itemNo).orElse(new Item());
	}
	
	public List<Item>  getAll(){
		return idao.findAll();
	}
	
	public Item updateItem(Item i) {
		Item i1 = idao.findById(i.getItemNo()).orElse(null);
		if(i1 != null) {
		i1.setItemName(i.getItemName());
		i1.setItemCost(i.getItemCost());
		}
		return idao.save(i1);
	}
	
	public String deleteItem(int itemNo) {
		Item i1 = idao.findById(itemNo).orElse(null);
		if(i1 != null) {
			idao.delete(i1);
			return "Item Deleeted";
		}
		else
		{
			return "Not available";
		}
	}
}
