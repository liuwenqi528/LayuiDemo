/**
 * Created by IntelliJ IDEA.
 * User: LiuWenqi
 * Date: 2017-12-08
 * Time: 17:16
 * Description:
 */
package com.example.layui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/system")
public class SystemController {
    @RequestMapping("/toSystemResource")
    public String listAll() {
        return "user3";
    }

}

