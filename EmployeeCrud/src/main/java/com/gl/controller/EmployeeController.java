package com.gl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gl.bean.Employee;
import com.gl.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService eService;
	
	@RequestMapping("/")
	public String goTO() {
		return "index";
	}
	
	@RequestMapping("/addEmployeeRecord")
	public String goTOIndex(Model model) {
		model.addAttribute("emp", new Employee());
		return "AddEmployee";
	}
	
	@RequestMapping("/addEmployee")
	public String goToAddEmployee(@ModelAttribute("emp") Employee emp) {
		eService.addEmployee(emp);
		return "redirect:/employeeList";
	}
	
	@RequestMapping("/employeeList")
	public String goToListOfEmployee(Model model) {
		List<Employee> list =eService.getListOfEmployee();
		model.addAttribute("list", list);
		return "home";
	}
	
	@RequestMapping("/deleteById")
	public String goToDeleteById(@RequestParam("id") int id) {
		eService.deleteById(id);
		return "redirect:/employeeList";
	}
	
	@RequestMapping("/editById")
	public String goToupdateById(@RequestParam("id") int id,Model model) {
		Employee e= eService.getById(id);
		model.addAttribute("emp", e);
		return "Update";
	}
	
	
	@RequestMapping("/updateEmployee")
	public String goToupdateEmployee(@ModelAttribute("emp") Employee emp){
		int id=emp.getId();
		eService.updateBYId(id, emp);
		return "redirect:/employeeList";
	}

}
