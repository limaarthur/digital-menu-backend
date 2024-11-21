package com.ignitec.menu.dtos;

import com.ignitec.menu.entities.Food;

public record FoodDTO(Long id, String title, String imgUrl, Integer price) {
    public FoodDTO(Food food) {
        this(food.getId(), food.getTitle(), food.getImgUrl(), food.getPrice());
    }
}
