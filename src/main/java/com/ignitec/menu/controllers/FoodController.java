package com.ignitec.menu.controllers;

import com.ignitec.menu.dtos.FoodDTO;
import com.ignitec.menu.entities.Food;
import com.ignitec.menu.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foods")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public ResponseEntity<Food> save(@RequestBody FoodDTO foodDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(foodService.save(foodDTO));
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodDTO> findAll() {
        var foods = foodService.findAll();
        return foods.stream().map(FoodDTO::new).toList();
    }
}
