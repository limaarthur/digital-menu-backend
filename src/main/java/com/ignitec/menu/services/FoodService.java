package com.ignitec.menu.services;

import com.ignitec.menu.dtos.FoodDTO;
import com.ignitec.menu.entities.Food;
import com.ignitec.menu.repositories.FoodRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public Food save(FoodDTO foodDTO) {
        Food food = new Food();
        BeanUtils.copyProperties(foodDTO, food);
        return foodRepository.save(food);
    }

    public List<Food> findAll() {
        return foodRepository.findAll();
    }
}
