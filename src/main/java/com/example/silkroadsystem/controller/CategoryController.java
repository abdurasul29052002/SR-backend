package com.example.silkroadsystem.controller;

import com.example.silkroadsystem.controller.template.GenericController;
import com.example.silkroadsystem.entity.Category;
import com.example.silkroadsystem.mapper.CategoryMapper;
import com.example.silkroadsystem.model.CategoryModel;
import com.example.silkroadsystem.repository.CategoryRepository;
import com.example.silkroadsystem.service.CategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/category")
public class CategoryController extends GenericController<Category, CategoryModel, CategoryRepository, CategoryMapper, CategoryService> {

}
