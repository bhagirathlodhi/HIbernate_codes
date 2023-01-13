package com.emp.employee;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CrudOp {
	private static Scanner sc;
	private static Session ss;
	private static SessionFactory sf;
	Employee emp = new Employee();
	Transaction tr = ss.beginTransaction();

	static {
		sc = new Scanner(System.in);
		Configuration cfg = new Configuration();
		cfg.configure();
		sf = cfg.buildSessionFactory();
		ss = sf.openSession();
	}

	void insertEmpData() {
		
		System.out.println("Enter Employee Name:-");
		String name = sc.next();
		emp.setName(name);
		System.out.println("Enter Employee Designation:-");
		String desg = sc.next();
		emp.setDesignation(desg);
		System.out.println("Enter Employee Department Name:-");
		String dName = sc.next();
		emp.setDeptName(dName);
		System.out.println("Enter Employee Salary:-");
		Double sal = sc.nextDouble();
		emp.setSalary(sal);
		
		ss.save(emp);
		tr.commit();
		ss.close();
		sf.close();
		System.out.println("new employee added successfully");
	}

	public void deleteData() {
		System.out.println("Enter Employee id:-");
		int id = sc.nextInt();
		ss.delete(emp);
		tr.commit();
		ss.close();
		sf.close();
		System.out.println("new employee delete successfully");
		
		
	}

}
