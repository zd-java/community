package com.zd.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 张东
 * @create 2020-02-17 16:25
 * @desc
 */
@Controller
public class PublishController {

    @GetMapping("/publish")
    public String publish() {
        return "publish";
    }
}
