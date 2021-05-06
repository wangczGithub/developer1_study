package com.ck.controller;

import com.ck.entity.Sushe;
import com.ck.service.ISusheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Description：
 *
 * @Author：wangcz
 * @Date 2021年05月06日 10:06
 */
@Controller
public class SusheController {


    @Autowired
    private ISusheService susheService;

    @RequestMapping("queryAll")
    public String queryAll(ModelMap map){
        List<Sushe> list = susheService.queryAll();
        System.out.println("list=" + list);
        map.put("susheList", list);
        return "sushe";// 验证是否自动加了视图解析器
    }

}
