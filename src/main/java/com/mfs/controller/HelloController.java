package com.mfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping(value = "/redirect")
    public String sendredirect(){
        return "redirect:/";
    }
    @RequestMapping(value = "/hello")
    @ResponseBody
    public String sayhello(){
        return "hello";
    }

}
