package com.house.wym.dao;

import com.house.wym.entity.Testing;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestingMapper {
    public int insertTesting(Testing testing);
}
