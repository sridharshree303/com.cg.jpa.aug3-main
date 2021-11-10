package com.cg.jpademo.dao;

import com.cg.jpademo.model.Employee;

import javax.persistence.EntityExistsException;

import com.cg.jpa.aug3.entities.Employee;

public class EmployeeDao {

	public static void main(String[] args) {
		
		public abstract Employee getEmployeeById(int Id);
		
		public abstract void addEmployee(Employee employee) throws EntityExistsException;
		
		public abstract void removeEmployee(Employee employee);
		
		public abstract void updateEmployee(Employee employee);
		
		public abstract void commitTransaction();
		
		public abstract void beginTransaction();
		

	}

	
		
	}

}
