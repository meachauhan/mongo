package com.mongo.mongo.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.mongo.repository.ItemRepository;
import com.mongo.mongo.model.GroceryItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class ItemController {

    @Autowired
    ItemRepository itemRepository;

    @GetMapping("/allItems")
    public List<GroceryItem> getAllItems() {
        return itemRepository.findAll();
    }

    @GetMapping("/healthCheck")
    public String healthCheck(){
        return "REST services are running fine.";
    }
    
    @GetMapping("/addItem")
    public String addItem() {
        //TODO: process POST request
        itemRepository.save(new GroceryItem("Whole Wheat Biscuit", "Whole Wheat Biscuit", 5, "snacks"));
        return "Item Added Sucessfully: " ;
    }
    
}
