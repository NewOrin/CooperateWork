package com.etc.cooperatework.controller;

import com.etc.cooperatework.entity.Department;
import com.etc.cooperatework.service.IDepartmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by NewOrin Zhang on 2016/7/8.
 * Email: NewOrinZhang@Gmail.com
 */

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({"classpath:config/applicationContext.xml", "classpath:config/dispatcher-servlet.xml"})
@Controller
@RequestMapping("/department")
public class DepartmentController {
    @Resource
    private IDepartmentService departmentService;

    @RequestMapping("show_others")
    public ModelAndView showOthers(HttpSession session) {
        ModelAndView mv = new ModelAndView("personal/emp_search");
        List<Department> list = departmentService.queryAll();
        mv.addObject("departList", list);
        System.out.println(list);
        return mv;
    }

    @RequestMapping("add")
    public void add() {
        Department department = new Department(1, "销售部");
        departmentService.add(department);
        System.out.print("添加成功!");
//        return "result";
    }
}
