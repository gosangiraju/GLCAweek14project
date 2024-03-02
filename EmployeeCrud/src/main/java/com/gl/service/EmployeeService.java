package com.gl.service;

import java.util.List;

import com.gl.bean.Employee;

public interface EmployeeService {
	
	public void deleteById(int id);
	public void updateBYId(int id,Employee s);
	public Employee getById(int id);
	public List<Employee> getListOfEmployee();
	public void addEmployee(Employee e);

}
