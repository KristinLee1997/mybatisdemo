package com.kristin.demo.mapper;

import com.kristin.demo.model.taskV2;

public interface taskV2Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(taskV2 record);

    int insertSelective(taskV2 record);

    taskV2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(taskV2 record);

    int updateByPrimaryKey(taskV2 record);
}