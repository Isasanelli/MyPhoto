package com.niuma.ilenia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")

    public String index() {

        return "index";
    }

    @RequestMapping("/demo")
    @ResponseBody
    public String demo() {

        return "this is a demon page";
    }
}