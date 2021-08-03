package com.company.mvcfreemarker.controller;

import com.company.mvcfreemarker.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/portal/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String getUsers(Model model) {
        model.addAttribute("users", userService.findAll());
        return "users";
    }
}
