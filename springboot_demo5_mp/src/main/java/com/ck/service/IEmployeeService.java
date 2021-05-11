package com.ck.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ck.entity.Employee;

public interface IEmployeeService {

    public Page<Employee>
        selectEmpPageBySQL(Page<Employee> page,String dname);
}
