package com.example.silkroadsystem.service;

import com.example.silkroadsystem.entity.Product;
import com.example.silkroadsystem.mapper.ProductMapper;
import com.example.silkroadsystem.model.ProductModel;
import com.example.silkroadsystem.repository.ProductRepository;
import com.example.silkroadsystem.service.template.GenericService;

public class ProductService extends GenericService<Product, ProductModel, ProductRepository, ProductMapper> {
    public ProductService(ProductRepository repository, ProductMapper mapper) {
        super(repository, mapper);
    }
}
