package com.secondmonth.bookable.modules.users.controller;

import com.secondmonth.bookable.modules.users.model.Users;
import com.secondmonth.bookable.modules.users.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    UsersService usersService;

    @Autowired
    public UserController(UsersService usersService) {
        this.usersService = usersService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody
    List<Users> getUsers() {
        return usersService.findAllUsers();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public @ResponseBody
    Users registerUser(Users users) throws IOException {
        return usersService.registerUser(users);
    }
}
