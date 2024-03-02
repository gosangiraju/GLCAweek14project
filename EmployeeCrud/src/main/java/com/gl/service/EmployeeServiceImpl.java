package com.gl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.bean.Employee;
import com.gl.dao.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDAO eDAO;

	@Override
	public void deleteById(int id) {
		eDAO.deleteById(id);

	}

	@Override
	public void updateBYId(int id,Employee s) {
		eDAO.updateBYId(id,s);
	}

	@Override
	public Employee getById(int id) {
		
		return eDAO.getById(id);
	}

	@Override
	public List<Employee> getListOfEmployee() {
		// TODO Auto-generated method stub
		return eDAO.getListOfEmployee();
	}

	@Override
	public void addEmployee(Employee e) {
		eDAO.addEmployee(e);

	}

}
