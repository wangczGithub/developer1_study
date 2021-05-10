package com.ck.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Description：
 *
 * @Author：wangcz
 * @Date 2021年05月10日 11:49
 */
@Data
@TableName("t_user")
public class User {

    @TableId("u_id")
    private int uid;
    @TableField("u_name")
    private String uname;
    @TableField("u_password")
    private String upassword;
    private int type;


}
