package com.company.mvcfreemarker.mapper;

import com.company.mvcfreemarker.dto.UserDto;
import com.company.mvcfreemarker.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserDto> fromEntities(List<User> users);
}
