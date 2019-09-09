package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("greet")
    @ResponseBody
    public String greet(String name){
        return "hello, " + name;
    }

    @GetMapping(value = "/getUser")
    @ResponseBody
    public User getUserById(int id){
        return userService.selectById(id);
    }

    @GetMapping("/printUser")
    @ResponseBody
    public String requestObject(User user){
        System.out.println(user);
        return "success";
    }

    @GetMapping("/getJsp")
    public String getJsp(){
        return "hello";
    }
}
