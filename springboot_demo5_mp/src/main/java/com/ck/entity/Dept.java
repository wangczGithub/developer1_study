package com.ck.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;


/**
 * Description：
 *
 * @Author：wangcz
 * @Date 2021年05月11日 8:46
 */
@Data
@TableName("t_dept")
public class Dept {

    @TableId(value = "d_id",type = IdType.AUTO)
    private int did;
    @TableField("d_name")
    private String dname;
    @TableField(exist = false)
    private List<Employee> employeeList;


    public Dept(int did, String dname) {
        this.did = did;
        this.dname = dname;
    }
}
