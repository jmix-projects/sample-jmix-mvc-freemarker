package com.company.mvcfreemarker.dto;

import com.company.mvcfreemarker.entity.User;

public class UserDto {
    private String username;
    private String email;

    public UserDto(User user) {
        this.username = user.getUsername();
        this.email = user.getEmail();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
