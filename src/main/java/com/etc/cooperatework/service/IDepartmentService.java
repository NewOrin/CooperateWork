package com.etc.cooperatework.service;


import com.etc.cooperatework.entity.Department;

import java.util.List;

/**
 * Created by NewOrin Zhang on 2016/7/8.
 * Email: NewOrinZhang@Gmail.com
 */
public interface IDepartmentService {

    int add(Department department);
    List<Department> queryAll();
}
