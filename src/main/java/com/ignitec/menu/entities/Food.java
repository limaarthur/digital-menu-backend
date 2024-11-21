package com.ignitec.menu.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_foods")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String imgUrl;
    private Integer price;
}
