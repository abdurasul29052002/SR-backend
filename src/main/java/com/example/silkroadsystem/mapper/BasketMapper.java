package com.example.silkroadsystem.mapper;

import com.example.silkroadsystem.entity.Basket;
import com.example.silkroadsystem.mapper.template.GenericMapper;
import com.example.silkroadsystem.model.BasketModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface BasketMapper extends GenericMapper<Basket, BasketModel> {
}
