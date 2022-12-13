package com.example.silkroadsystem.controller;

import com.example.silkroadsystem.controller.template.GenericController;
import com.example.silkroadsystem.entity.Basket;
import com.example.silkroadsystem.mapper.BasketMapper;
import com.example.silkroadsystem.model.BasketModel;
import com.example.silkroadsystem.repository.BasketRepository;
import com.example.silkroadsystem.service.BasketService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basket")
public class BasketController extends GenericController<Basket, BasketModel, BasketRepository, BasketMapper, BasketService> {
}
