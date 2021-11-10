package com.cg.jpademo.service;

import javax.persistence.EntityExistsException;

import com.cg.jpademo.dao.EmployeeDao;
import com.cg.jpademo.dao.EmployeeDaoImpl;
import com.cg.jpademo.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao dao;
	
	public EmployeeServiceImpl(){
		dao = new EmployeeDaoImpl();
	}

	@Override
	public void addEmployee(Employee employee) {
		dao.beginTransaction();
		try {
			dao.addEmployee(employee);
			dao.commitTransaction();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void updateEmployee(Employee employee) {
		dao.beginTransaction();
		dao.updateEmployee(employee);
		dao.commitTransaction();
	}

	@Override
	public void removeEmployee(Employee employee) {
		dao.beginTransaction();
		dao.removeEmployee(employee);
		dao.commitTransaction();
		
	}

	@Override
	public Employee findEmployeeById(int id) {
		Employee employee;
		employee = dao.getStudentById(id);
		System.out.println("FindStudentById in StudentServiceImpl");
		return null;
	}

}
