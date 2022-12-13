package com.example.silkroadsystem.mapper;

import com.example.silkroadsystem.entity.User;
import com.example.silkroadsystem.mapper.template.GenericMapper;
import com.example.silkroadsystem.model.UserModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {BasketMapper.class})
public interface UserMapper extends GenericMapper<User, UserModel> {
}
