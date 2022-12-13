package com.example.silkroadsystem.model;

import com.example.silkroadsystem.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryModel {
    private Long id;

    private String name;
}
