package com.te.springmvcproject.Dao;

import com.te.springmvcproject.beans.EmployeeBean;

public interface EmployeeDAO {
	
	public EmployeeBean authenticate(int id,String password);
	
	public EmployeeBean getEmployee(int id);
}
