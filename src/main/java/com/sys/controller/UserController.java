package com.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.sys.service.UserService;

@Controller
//@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getPassword")
    public String getPassword(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "password",required = false) String password){
        if(userService.getPassword(name).equals(password)){
            return "views/main";
        }else {
            return "views/error";
        }
    }
}
