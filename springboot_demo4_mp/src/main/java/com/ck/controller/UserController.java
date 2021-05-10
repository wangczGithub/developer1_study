package com.ck.controller;

import com.ck.entity.User;
import com.ck.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Description：
 *
 * @Author：wangcz
 * @Date 2021年05月10日 11:52
 */
@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("queryAllUsers")
    @ResponseBody
    public List<User> queryAllUsers(){
        return userService.queryAll();
    }

}
