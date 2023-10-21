package com.example.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Item;
import com.example.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {

    private final ItemService itemService;

    @Autowired
    // ItemServiceをインジェクションします
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }
    
    // データ取得用のWeb APIです
    @GetMapping("/list")
    public List<Item> list() {
        // List<Item>の形式で取得した値を返します
        return this.itemService.findAll();
    }
}