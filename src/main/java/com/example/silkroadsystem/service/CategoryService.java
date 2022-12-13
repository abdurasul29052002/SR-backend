package com.example.silkroadsystem.service;

import com.example.silkroadsystem.entity.Category;
import com.example.silkroadsystem.mapper.CategoryMapper;
import com.example.silkroadsystem.model.CategoryModel;
import com.example.silkroadsystem.repository.CategoryRepository;
import com.example.silkroadsystem.service.template.GenericService;
import org.springframework.stereotype.Service;

@Service
public class CategoryService extends GenericService<Category, CategoryModel, CategoryRepository, CategoryMapper> {
    public CategoryService(CategoryRepository repository, CategoryMapper mapper) {
        super(repository, mapper);
    }
}
