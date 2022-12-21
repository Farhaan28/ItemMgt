package com.sboot.ItemMgt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sboot.ItemMgt.model.Item;

public interface ItemDao extends JpaRepository<Item, Integer>{

}
