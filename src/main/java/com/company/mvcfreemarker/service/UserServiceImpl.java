package com.company.mvcfreemarker.service;

import com.company.mvcfreemarker.dto.UserDto;
import com.company.mvcfreemarker.entity.User;
import io.jmix.core.UnconstrainedDataManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private UnconstrainedDataManager dataManager;

    public UserServiceImpl(UnconstrainedDataManager dataManager) {
        this.dataManager = dataManager;
    }

    @Override
    public List<UserDto> findAll() {
        return dataManager.load(User.class).all().list().stream()
                .map(UserDto::new)
                .collect(Collectors.toList());
    }
}
