package com.ignitec.menu.repositories;

import com.ignitec.menu.entities.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
