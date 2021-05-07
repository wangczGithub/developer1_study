package com.ck.controller;

import com.ck.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description：
 *
 * @Author：wangcz
 * @Date 2021年05月07日 8:51
 */
@Controller
public class TestController {

    @RequestMapping("toPage")
    public String page(String page){
        return page;
    }

    @GetMapping("test1")
    @ResponseBody
    public String test1(){
        System.out.println("正在处理请求.....");
        return "hello";
    }


    @GetMapping("test2")
    public String test2(ModelMap map){
        map.put("name", "谭鹤红");
        map.put("sex", "男");
        return "index";
    }

    @RequestMapping("test3")
    public String test3(User user,ModelMap map){
        System.out.println("user:" + user);
        String md5Pwd = "alkdjlsdjjl";// 模拟md5加密的密文
        user.setUpwd(md5Pwd);
        map.put("loginUser", user);
        return "index";
    }

}
