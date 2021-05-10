package com.ck.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

/**
 * Description：
 *
 * @Author：wangcz
 * @Date 2021年05月10日 8:47
 */
@Data
// 指定当前实体类对应的数据库表名
@TableName("goods")
public class Sushe {

    // @TableId注解在一个属性上，说明这个属性对应表中的哪个主键字段
    @TableId
    private int id;
    // @TableField注解在一个属性上，说明这个属性对应表中的哪个非主键字段
    private String name;
    private String address;
    private int peoples;

    // exist=false说明该属性在表中不存在这样的字段
    @TableField(exist = false)
    private List<Student> stuList;


    public Sushe(int id, String name, String address, int peoples) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.peoples = peoples;
    }
}
