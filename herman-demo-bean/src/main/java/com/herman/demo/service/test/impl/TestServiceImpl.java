package com.herman.demo.service.test.impl;

import com.herman.demo.dao.test.ITestDao;
import com.herman.demo.entity.test.Test;
import com.herman.demo.service.test.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by herman on 2017/11/28.
 */
@Service
public class TestServiceImpl implements ITestService {

    @Autowired
    private ITestDao testDao;

    @Override
    public Test getTest(Long id) {
        return testDao.get(id);
    }
}
