package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String one(Map<String,Object> model){
        model.put("score",68);
        return "one";
    }
}
