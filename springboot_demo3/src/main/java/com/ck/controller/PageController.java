package com.ck.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description：
 *
 * @Author：wangcz
 * @Date 2021年05月08日 9:45
 */
@Controller
public class PageController {

    @RequestMapping("toPage/{page}")
    public String toPage(@PathVariable String page){
        return page;
    }

    /**
     * 统一的错误页面跳转
     * @param code
     * @return
     */
    @RequestMapping("errorPage/{code}")
    public String errorPage404(@PathVariable String code){
        return "errors/" + code;
    }

}
