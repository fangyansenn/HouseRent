package com.house.wym.service.impl;

import com.house.wym.dao.TestingMapper;
import com.house.wym.entity.Testing;
import com.house.wym.service.ITestingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ITestingImpl implements ITestingService {

    @Autowired
    private TestingMapper TestingMapper;

    @Override
    public int addtesting(Testing testing) {
        return TestingMapper.insertTesting(testing);
    }
}