package com.gl.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.gl.bean.Employee;

@Repository
@EnableTransactionManagement
public class EmployeeDAOImpl implements EmployeeDAO {
	
	SessionFactory sf;
	Session session;
	
	public EmployeeDAOImpl(SessionFactory sf) {
		this.sf=sf;
		this.session=sf.openSession();
	}

	@Override
	public void deleteById(int id) {
		Transaction tax=session.beginTransaction();
		Employee s1=getById(id);
		if(s1!=null) {
			session.delete(s1);
		}
		else {
			System.out.println("No Student id doesn't exist");
		}
		tax.commit();

	}

	@Override
	public void updateBYId(int id, Employee s) {
		Transaction tax=session.beginTransaction();
		Employee oldEmp=getById(id);
		oldEmp.setEmployeeAddress(s.getEmployeeAddress());
		oldEmp.setEmployeeName(s.getEmployeeName());
		oldEmp.setEmployeePhone(s.getEmployeePhone());
		oldEmp.setEmployeeSalary(s.getEmployeeSalary());
		session.save(oldEmp);
		tax.commit();

	}

	@Override
	public Employee getById(int id) {
		
		return session.get(Employee.class, id);
	}

	@Override
	public List<Employee> getListOfEmployee() {
		
		return (List<Employee>) session.createQuery("from Employee").list();
	}

	@Override
	public void addEmployee(Employee e) {
		Transaction tx=session.beginTransaction();
		session.saveOrUpdate(e);
		tx.commit();
		
	}

}
