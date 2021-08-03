package com.company.mvcfreemarker.service;

import com.company.mvcfreemarker.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> findAll();
}
