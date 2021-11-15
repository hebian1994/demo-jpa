package com.example.demojpa.controller;

import com.example.demojpa.model.AyUser;
import com.example.demojpa.service.AyUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/ay")
public class AyUserController {
    @Resource
    private AyUserService ayUserService;

    @RequestMapping("/hello")
    public String test(Model model) {
        System.out.println("1111111111111111111111111111");
        List<AyUser> ayUsers = ayUserService.findAll();
        model.addAttribute("ayUsers", ayUsers);
        return "ayUser";
    }
}
