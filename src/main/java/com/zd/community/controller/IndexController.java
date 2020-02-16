package com.zd.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 张东
 * @create 2020-02-16 15:49
 * @desc
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String hello() {
        return "index";
    }
}
