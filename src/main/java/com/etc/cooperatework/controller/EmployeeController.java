package com.etc.cooperatework.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.etc.cooperatework.entity.Employee;
import com.etc.cooperatework.service.IEmployeeService;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({ "classpath:config/applicationContext.xml",
//		"classpath:config/dispatcher-servlet.xml" })

@Controller
@RequestMapping("/employee")
public class EmployeeController {

  @Resource
  private IEmployeeService employeeService;

  @RequestMapping("login")
  public ModelAndView login(@ModelAttribute("employee") Employee employee, HttpSession session) {
      ModelAndView mv = new ModelAndView();
      System.out.println("接收到请求参数:" + employee);
      Employee e = employeeService.doLogin(employee);
      if (e == null) {
          mv.addObject("ename", "");
          mv.setViewName("login");
          System.out.println("用户名或者密码错误!");
          return mv;
      } else {
          System.out.println("登录成功!");
          session.setAttribute("employee", e);
          mv.addObject("ename", employee.getEname());
          mv.setViewName("main");
          return mv;
      }
  }

  /**
   * 显示个人信息
   *
   * @param session
   * @return
   */
  @RequestMapping("show_info")
  public ModelAndView showInfo(HttpSession session) {
      ModelAndView mv = new ModelAndView();
      Employee e = (Employee) session.getAttribute("employee");
      mv.addObject("employee", e);
      System.out.println("从会话获取:" + e);
      mv.setViewName("personal/emp_info");
      return mv;
  }

  @RequestMapping("edit_info")
  public ModelAndView editInfo(HttpSession session) {
      ModelAndView mv = new ModelAndView();
      mv.addObject("employee", session.getAttribute("employee"));
      mv.setViewName("personal/edit_info");
      return mv;
  }

  @RequestMapping("queryOther")
  public String queryOthers() {
      return "redirect:/department/show_others.html";
  }

  @RequestMapping("logout")
  public ModelAndView logout(HttpSession session) {
      session.removeAttribute("employee");
      System.out.println("成功退出");
      return new ModelAndView("redirect:/");
  }

  @RequestMapping("add")
  public ModelAndView add() {
      Employee employee = new Employee("Clay Thomposon", "011",
              "Right, my name is thomposon", "NBA", "243435456", "0", null,
              null);
      employeeService.addEmployee(employee);
      System.out.println("插入成功! " + employee);
      return new ModelAndView("redirect:main");
  }

  /**
   * 更新员工信息
   *
   * @param employee
   * @return
   */
  @RequestMapping("update")
  @ResponseBody
  public String update(@ModelAttribute("employee") Employee employee, HttpSession session) {
      System.out.println(employee);
      session.setAttribute("employee", employee);
      employeeService.updateEmployee(employee);
      System.out.println("更新成功!");
      String data = "success";
      return data;
  }

  @RequestMapping("findAll")
  public ModelAndView findAll() {
      System.out.println("查询...");
      ModelAndView mv = new ModelAndView();
      List<Employee> list = employeeService.findAll();
      if (list.size() == 0) System.out.println("无查询结果");
      mv.addObject("employeeList", list);
      for (Employee e : list) {
          System.out.println(e);
      }
      mv.setViewName("result");
      return mv;
  }

  @RequestMapping("delete")
  public String delete(@RequestParam(value = "eid", required = true) int eid) {
      employeeService.deleteEmployee(eid);
      System.out.println("删除成功!");
      return "result";
  }
}