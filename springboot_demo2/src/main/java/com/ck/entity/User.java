package com.ck.entity;

import lombok.*;
import lombok.extern.log4j.Log4j;

/**
 * Description：
 *
 * @Author：wangcz
 * @Date 2021年05月07日 11:09
 */
@Data
public class User {

    private int uid;
    private String uname;
    private String upwd;

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }
}
