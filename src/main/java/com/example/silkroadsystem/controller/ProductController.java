package com.example.silkroadsystem.controller;

import com.example.silkroadsystem.controller.template.GenericController;
import com.example.silkroadsystem.entity.Product;
import com.example.silkroadsystem.mapper.ProductMapper;
import com.example.silkroadsystem.model.ProductModel;
import com.example.silkroadsystem.repository.ProductRepository;
import com.example.silkroadsystem.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController extends GenericController<Product, ProductModel, ProductRepository, ProductMapper, ProductService> {

}
