package com.ck.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Description：
 *
 * @Author：wangcz
 * @Date 2021年05月11日 10:59
 */
@Data
@TableName("t_emp")
public class Employee {

    @TableId(value = "e_id",type = IdType.AUTO)
    private int eid;
    @TableField("e_name")
    private String ename;
    @TableField("e_sex")
    private String esex;
    @TableField("e_salary")
    private double esalary;
    @TableField("e_position")
    private String eposition;
    @TableField("e_in")
    private String ein;
    @TableField(exist = false)
    private Dept dept;

}
