package com.etc.cooperatework.service.impl;

import com.etc.cooperatework.dao.DepartmentMapper;
import com.etc.cooperatework.entity.Department;
import com.etc.cooperatework.service.IDepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by NewOrin Zhang on 2016/7/8.
 * Email: NewOrinZhang@Gmail.com
 */
@Service
public class DepartmentService implements IDepartmentService {

    @Resource
    private DepartmentMapper departmentMapper;

    public int add(Department department) {
        departmentMapper.insert(department);
        return 0;
    }

    public List<Department> queryAll() {
        return departmentMapper.findAll();
    }
}
