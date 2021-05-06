package com.ck.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description：
 *
 * @Author：wangcz
 * @Date 2021年05月06日 9:30
 */
@Controller
public class TestController {

    @RequestMapping("test1")
    @ResponseBody
    public String test1(){
        return "hello springboot";
    }
}
