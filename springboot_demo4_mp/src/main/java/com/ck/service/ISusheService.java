package com.ck.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ck.entity.Sushe;

import java.util.List;
import java.util.Map;

public interface ISusheService {

    // mybatis实现的
    public List<Sushe> queryAllByMybatis();

    // mp实现的
    // 1 添加
    public void addSushe(Sushe sushe);
    // 2、修改
    public void updateSushe(Sushe sushe);
    // 3 根据id做删除
    public void deleteByID(int id);
    // 4 根据多个条件做删除，条件放在map中
    public void deleteByMap(Map paramMap);
    // 5 查询所有
    public List<Sushe> queryAllByMp();
    public List<Sushe> queryByWrapper(QueryWrapper<Sushe> wrapper);
}
