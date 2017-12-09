/**
 * Created by IntelliJ IDEA.
 * User: LiuWenqi
 * Date: 2017-12-08
 * Time: 16:45
 * Description:
 */
package com.example.layui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("toIndex")
    public String toIndex(){
        return "layui";
    }
}
