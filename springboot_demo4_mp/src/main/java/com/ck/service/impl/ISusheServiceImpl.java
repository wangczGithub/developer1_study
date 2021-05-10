package com.ck.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ck.dao.ISusheDao;
import com.ck.entity.Sushe;
import com.ck.service.ISusheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Description：
 *
 * @Author：wangcz
 * @Date 2021年05月10日 8:52
 */
@Service
public class ISusheServiceImpl implements ISusheService {

    @Autowired
    private ISusheDao susheDao;

    @Override
    public List<Sushe> queryAllByMybatis() {
        return susheDao.queryAllByMybatis();
    }


    // mp实现的
    // 1 添加
    public void addSushe(Sushe sushe){
        susheDao.insert(sushe);
    }

    // 2 根据id做修改
    public void updateSushe(Sushe sushe){
        susheDao.updateById(sushe);
    }
    // 3 根据id做删除
    public void deleteByID(int id){
        susheDao.deleteById(id);
    }
    // 4 根据多个条件做删除，条件放在map中
    public void deleteByMap(Map paramMap){
        susheDao.deleteByMap(paramMap);
    }
    // 5 查询所有
    public List<Sushe> queryAllByMp(){
        return susheDao.selectList(null);
    }
    // 6、多条件查询，name模糊查询，peoples区间查询
    public List<Sushe> queryByWrapper(QueryWrapper<Sushe> wrapper){
        return susheDao.selectList(wrapper);
    }





}
