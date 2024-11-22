package com.ignitec.menu.controllers;

import com.ignitec.menu.dtos.FoodDTO;
import com.ignitec.menu.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/foods")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping
    public List<FoodDTO> findAll() {
        var foods = foodService.findAll();
        return foods.stream().map(FoodDTO::new).toList();
    }
}
