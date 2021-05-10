package com.ck.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ck.entity.Sushe;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ISusheDao extends BaseMapper<Sushe> {
    // 使用mybatis查询所有宿舍
    @Select("select * from goods")
    @ResultMap("susheMapper")
    public List<Sushe> queryAllByMybatis();
}
