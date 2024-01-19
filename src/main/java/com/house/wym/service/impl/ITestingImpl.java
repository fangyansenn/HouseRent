package com.house.wym.service.impl;

import com.house.wym.dao.TestingMapper;
import com.house.wym.entity.Testing;
import com.house.wym.service.ITestingService;
import org.springframework.beans.factory.annotation.Autowired;

public class ITestingImpl implements ITestingService {

    private TestingMapper TestingMapper;

    @Override
    public int testing(Testing testing) {
        return TestingMapper.insertTesting(testing);
    }
}