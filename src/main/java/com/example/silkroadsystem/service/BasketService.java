package com.example.silkroadsystem.service;

import com.example.silkroadsystem.entity.Basket;
import com.example.silkroadsystem.mapper.BasketMapper;
import com.example.silkroadsystem.model.BasketModel;
import com.example.silkroadsystem.repository.BasketRepository;
import com.example.silkroadsystem.service.template.GenericService;
import org.springframework.stereotype.Service;

@Service
public class BasketService extends GenericService<Basket, BasketModel, BasketRepository, BasketMapper> {
    public BasketService(BasketRepository repository, BasketMapper mapper) {
        super(repository, mapper);
    }
}
