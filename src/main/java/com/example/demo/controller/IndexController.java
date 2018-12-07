package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String one(Map<String,Object> model){
        model.put("score",68);
        return "one";
    }
    
    @RequestMapping("/two.html")
    public String two(Model model) {
    	model.addAttribute("score", 18);
    	return "one";
    }
}
