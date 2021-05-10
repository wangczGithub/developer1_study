package com.ck.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ck.entity.Sushe;
import com.ck.service.ISusheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description：
 *
 * @Author：wangcz
 * @Date 2021年05月10日 8:53
 */
@Controller
public class SusheController {

    @Autowired
    private ISusheService susheService;

    @RequestMapping("queryAllByMybatis")
    @ResponseBody
    public List<Sushe> queryAllByMybatis(){
//        return susheService.queryAllByMybatis();
        return susheService.queryAllByMp();
//        QueryWrapper<Sushe> wrapper = new QueryWrapper<>();
//        wrapper.like("name", "12")
//                .between("peoples", 3, 5);
//        return susheService.queryByWrapper(wrapper);
    }

    @RequestMapping("addSusheByMP")
    @ResponseBody
    public String addSusheByMP(){
         //添加
//        Sushe sushe = new Sushe(0, "409", "创科409", 5);
//        susheService.addSushe(sushe);

        // 根据id做修改
//        Sushe sushe = new Sushe(9, "4009", "创科4009", 6);
//        susheService.updateSushe(sushe);

        // 根据一个id做删除
//        susheService.deleteByID(9);

        // 根据map参数条件做删除
        Map map = new HashMap();
        map.put("peoples", 5);// 删除peoples=44的宿舍
        map.put("name", "1203宿舍");// 并且name="1203宿舍"的宿舍
        susheService.deleteByMap(map);
        return "ok";
    }

}
