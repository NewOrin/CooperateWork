package com.etc.cooperatework.dao;

import com.etc.cooperatework.entity.Department;

import java.util.List;

public interface DepartmentMapper {
    List<Department> findAll();
    int deleteByPrimaryKey(Integer did);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}