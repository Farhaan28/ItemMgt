package com.sboot.ItemMgt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sboot.ItemMgt.model.Item;
import com.sboot.ItemMgt.service.ItemService;

@RestController
@RequestMapping("/itemmgt/")
public class ItemController {
	@Autowired
	private ItemService iservice;
	
	@PostMapping("productItem")
	public Item addItem(@RequestBody Item i) {
		return iservice.addItem(i);	
	}
	
	@GetMapping("productItem/{itemNo}")
	public Item getItem(@PathVariable int itemNo) {
		return iservice.getItem(itemNo);
	}
	
	@GetMapping("productItem")
	public List<Item> getAll(){
		return iservice.getAll();
	}
	
	@PutMapping("productItem")
	public Item updateItem(@RequestBody Item i) {
		return iservice.updateItem(i);
	}
	
	@DeleteMapping("productItem/{itemNo}")
	public String deleteItem(@PathVariable int itemNo) {
		return iservice.deleteItem(itemNo);	
	}
}
