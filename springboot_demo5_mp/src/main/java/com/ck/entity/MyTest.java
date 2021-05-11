package com.ck.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Description：
 *
 * @Author：wangcz
 * @Date 2021年05月11日 9:12
 */
@Data
@TableName("t_test")
public class MyTest {

    // 指定主键生成策略为ASSIGN_ID
    @TableId(type = IdType.ASSIGN_ID)
    private String id;
    private String name;

    public MyTest(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
