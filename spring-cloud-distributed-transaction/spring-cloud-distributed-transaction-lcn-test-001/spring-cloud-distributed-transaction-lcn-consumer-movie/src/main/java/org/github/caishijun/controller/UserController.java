package org.github.caishijun.controller;

import org.github.caishijun.entity.User;
import org.github.caishijun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    @ResponseBody
    public List<User> list(){
        return userService.list();
    }


    @RequestMapping("/save")
    @ResponseBody
    public int save(){
        return userService.save();
    }

}
