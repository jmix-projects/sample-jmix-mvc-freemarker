package com.company.mvcfreemarker.controller;

import com.company.mvcfreemarker.entity.User;
import io.jmix.core.UnconstrainedDataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/portal/users")
public class UserController {
    @Autowired
    private UnconstrainedDataManager dataManager;

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String getUsers(@ModelAttribute("model") ModelMap model) {
        model.addAttribute("users", dataManager.load(User.class).all().list());
        return "users";
    }
}
