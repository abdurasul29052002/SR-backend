package com.example.silkroadsystem.mapper;

import com.example.silkroadsystem.entity.Category;
import com.example.silkroadsystem.mapper.template.GenericMapper;
import com.example.silkroadsystem.model.CategoryModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper extends GenericMapper<Category, CategoryModel> {
}
