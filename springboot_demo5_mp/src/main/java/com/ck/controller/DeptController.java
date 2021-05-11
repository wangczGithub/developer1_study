package com.ck.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ck.entity.Dept;
import com.ck.entity.Employee;
import com.ck.entity.MyTest;
import com.ck.service.IDeptService;
import com.ck.service.IEmployeeService;
import com.ck.service.ITestService;
import org.omg.CORBA.SetOverrideType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Description：
 *
 * @Author：wangcz
 * @Date 2021年05月11日 8:51
 */
@Controller
public class DeptController {

    @Autowired
    private IDeptService deptService;

    @Autowired
    private ITestService testService;

    @Autowired
    private IEmployeeService employeeService;

    @RequestMapping("addDeptTest")
    @ResponseBody
    public void addDeptTest(){
        //deptService.addDept(new Dept(100, "网络部1"));
        testService.addTest(new MyTest(null, "张三"));
    }

    @RequestMapping("deptPage")
    @ResponseBody
    public List<Dept> deptPage(){
        // 创建分页信息对象Page，第2页，每页显示3条数
        Page<Dept> page = new Page<>(2, 3);
        // 根据部门名称模糊查询分页
        QueryWrapper<Dept> wrapper = new QueryWrapper<>();
        wrapper.like("d_name", "部");
        Page<Dept> resultPage =
                deptService.selectDeptPage(page, null);
        // 获取分页数据
        List<Dept> deptList = resultPage.getRecords();
        // 当前页
        long pageCurrent = resultPage.getCurrent();
        // 每页显示的条数
        long size = resultPage.getSize();
        // 总页数
        long pages = resultPage.getPages();
        // 总条数
        long total = resultPage.getTotal();
        System.out.println("pageCurrent=" + pageCurrent);
        System.out.println("size=" + size);
        System.out.println("pages=" + pages);
        System.out.println("total=" + total);
        return deptList;

    }



    @RequestMapping("empPage")
    @ResponseBody
    public List<Employee> empPage(){
        // 创建分页信息对象Page，第2页，每页显示3条数
        Page<Employee> page = new Page<>(2, 3);
        Page<Employee> resultPage =
                employeeService.selectEmpPageBySQL(page,"教学部");
        return resultPage.getRecords();

    }
}
