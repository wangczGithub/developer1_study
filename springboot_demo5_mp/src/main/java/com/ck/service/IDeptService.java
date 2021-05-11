package com.ck.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ck.entity.Dept;

public interface IDeptService {

    public void addDept(Dept dept);

    // 分页
    public Page<Dept> selectDeptPage(Page<Dept> page, QueryWrapper wrapper);
}
