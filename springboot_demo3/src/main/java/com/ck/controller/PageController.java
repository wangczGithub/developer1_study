package com.ck.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description：
 *
 * @Author：wangcz
 * @Date 2021年05月08日 9:45
 */
@Controller
public class PageController {

    @RequestMapping("toPage")
    public String toPage(String page){
        return page;
    }

}
