package com.ck.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ck.dao.IEmployeeDao;
import com.ck.entity.Employee;
import com.ck.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description：
 *
 * @Author：wangcz
 * @Date 2021年05月11日 11:05
 */
@Service
public class IEmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private IEmployeeDao employeeDao;

    public Page<Employee>
    selectEmpPageBySQL(Page<Employee> page,String dname){
        return employeeDao.selectEmpPageBySQL(page,dname);
    }

}
