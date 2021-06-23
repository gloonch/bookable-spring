package com.secondmonth.bookable.modules;

import com.secondmonth.bookable.modules.users.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    UsersService usersService;

    @Autowired
    public MainController(UsersService usersService) {
        this.usersService = usersService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public @ResponseBody
    String index() {
        return "You're on index!";
    }

}
