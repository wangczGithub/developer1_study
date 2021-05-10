package com.ck.service.impl;

import com.ck.dao.IUserDao;
import com.ck.entity.User;
import com.ck.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description：
 *
 * @Author：wangcz
 * @Date 2021年05月10日 11:51
 */
@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> queryAll() {
        return userDao.selectList(null);
    }
}
