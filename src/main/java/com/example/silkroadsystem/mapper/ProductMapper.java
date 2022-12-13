package com.example.silkroadsystem.mapper;

import com.example.silkroadsystem.entity.Product;
import com.example.silkroadsystem.mapper.template.GenericMapper;
import com.example.silkroadsystem.model.ProductModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper extends GenericMapper<Product, ProductModel> {
}
