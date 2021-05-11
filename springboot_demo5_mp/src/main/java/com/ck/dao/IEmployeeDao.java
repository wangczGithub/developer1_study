package com.ck.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ck.entity.Employee;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface IEmployeeDao extends BaseMapper<Employee> {

    // 自定义分页查询,根据部门名称查询员工的分页信息
    @Select("select e.* from t_emp e join t_dept d " +
            " ON e.e_d_id=d.d_id " +
            " where d.d_name=#{dname}")
    @ResultMap("empMapper")
    public Page<Employee>
        selectEmpPageBySQL(Page<Employee> page,String dname);
}
