package com.emp.employee;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("Welcome");
		CrudOp op = new CrudOp();
		Scanner br = new Scanner(System.in);
		while (true) {
			System.out.println("             press 1 to add New Employee");
			System.out.println("             press 2 to delete Employee records");
			System.out.println("             press 3 to display Employee Record");
			System.out.println("             press 4 to Update Employee record..");
			System.out.println("             press 5 to exit from app");
			int choiche = br.nextInt();
			switch (choiche) {
			case 1:
				op.insertEmpData();
				break;
			case 2:
				op.deleteData();
				break;

			case 3:

				break;

			case 4:

				break;
			case 5:

				break;

			default:
				break;
			}
		}
	}
}
