package com.ck.service.impl;

import com.ck.dao.ITestDao;
import com.ck.entity.MyTest;
import com.ck.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description：
 *
 * @Author：wangcz
 * @Date 2021年05月11日 9:17
 */
@Service
public class ITestServiceImpl implements ITestService {

    @Autowired
    private ITestDao testDao;
    @Override
    public void addTest(MyTest test) {
        testDao.insert(test);
        System.out.println("test=" + test);
    }
}
