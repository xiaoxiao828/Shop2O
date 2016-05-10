package com.shop.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiao.lai on 16/5/9.
 */
@Controller
public class PageController {

    @RequestMapping("/")
    private String showIndex(){

        String x = "s";
        return "index";
    }


    @RequestMapping("/{page}")
    private String showPage(@PathVariable String page){

        String x = "s";
        return page;
    }
}
