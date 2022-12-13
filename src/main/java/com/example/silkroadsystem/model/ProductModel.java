package com.example.silkroadsystem.model;

import com.example.silkroadsystem.entity.Attachment;
import com.example.silkroadsystem.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductModel {
    private Long id;

    private String name;

    private String price;

    private List<Attachment> photos;

    private Category category;
}
