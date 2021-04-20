package com.te.springmvcproject.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.te.springmvcproject.Dao.EmployeeDAO;
import com.te.springmvcproject.beans.EmployeeBean;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeDAO dao; 
	
	@GetMapping("/empLogin")
	public String getLogin() {
		return "empLogin";
	}//end of getLogin
	
	@PostMapping("/empLogin")
	public String authenticate(int id,String password,HttpServletRequest request,ModelMap map) {
		EmployeeBean bean = dao.authenticate(id, password);
		
		if(bean!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("emp",	bean);
			return "homePage";
			
		}else {
			map.addAttribute("errMsg", "invalid credentials");
			return "empLogin";
		}
	}
	
	@GetMapping("/searchForm")
	public String getSearchForm(ModelMap map,HttpSession session) {
		if(session.getAttribute("emp")!=null) {
			return "searchForm";
		}
		else {
			map.addAttribute("err msg", "please login again");
			return "empLogin";
		}
	}
		
	@GetMapping("/searchForm2")
	public String searchEmp(int id, ModelMap map, 
			@SessionAttribute(name="emp", required=false) EmployeeBean employeeBean) {
		
		if(employeeBean!=null) {
			EmployeeBean employeeBean2=dao.getEmployee(id);
			if(employeeBean2 != null) {
				map.addAttribute("data", employeeBean2);
			}
			else {
				map.addAttribute("msg","data not found"+id);
			}
			return "searchForm";
		}else {
			map.addAttribute("err msg","please login first");
			return "empLogin";
		}
	}
	
	@GetMapping("/logout")
	public String logOut(HttpSession session,ModelMap map) {
		session.invalidate();
		map.addAttribute("msg", "logout successfull");
		return "empLogin";
	}
}//end of authenticate
