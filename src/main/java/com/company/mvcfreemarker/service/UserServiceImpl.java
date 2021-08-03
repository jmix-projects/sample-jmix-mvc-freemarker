package com.company.mvcfreemarker.service;

import com.company.mvcfreemarker.dto.UserDto;
import com.company.mvcfreemarker.entity.User;
import com.company.mvcfreemarker.mapper.UserMapper;
import io.jmix.core.UnconstrainedDataManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UnconstrainedDataManager dataManager;
    private UserMapper userMapper;

    public UserServiceImpl(UnconstrainedDataManager dataManager, UserMapper userMapper) {
        this.dataManager = dataManager;
        this.userMapper = userMapper;
    }

    @Override
    public List<UserDto> findAll() {
        return userMapper.fromEntities(dataManager.load(User.class).all().list());
    }
}
