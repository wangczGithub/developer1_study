package com.ck.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ck.dao.IDeptDao;
import com.ck.entity.Dept;
import com.ck.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description：
 *
 * @Author：wangcz
 * @Date 2021年05月11日 8:50
 */
@Service
public class IDeptServiceImpl implements IDeptService {

    @Autowired
    private IDeptDao deptDao;

    @Override
    public void addDept(Dept dept) {
        deptDao.insert(dept);
        System.out.println("dept:" + dept);
    }

    // 带条件分页
    public Page<Dept> selectDeptPage(Page<Dept> page, QueryWrapper wrapper){
        return deptDao.selectPage(page, wrapper);
    }
}
