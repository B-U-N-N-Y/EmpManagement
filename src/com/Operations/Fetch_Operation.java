package com.Operations;

public class Fetch_Operation extends Create_New_Emp {
	short flag = 0;

	public void fetchDetails() {
		for (EmployeeDetails ed : emp_list) {
			flag = 1;
			System.out.println("Personal Details of the Employee Are:\n");
			System.out.println(ed.emp_name + "\n" + ed.emp_age + "\n" + ed.emp_gender + "\n" + ed.emp_address + "\n");
			System.out.println("Professional Details of the Employee Are:\n");
			System.out.println(ed.emp_id + "\n" + ed.emp_name + "\n" + ed.emp_salary + "\n" + ed.emp_department + "\n"
					+ ed.emp_skills + "\n");
		}
		if (flag == 0) {
			System.out.println("No Records Found");
		}
	}

	public void fetchDetails(String name) {
		for (EmployeeDetails ed : emp_list) {
			if (ed.emp_name.equalsIgnoreCase(name) || ed.emp_department.equalsIgnoreCase(name)) {
				flag = 1;
				System.out.println("\nPersonal Details of an Employee Are:\n");
				System.out
						.println(ed.emp_name + "\n" + ed.emp_age + "\n" + ed.emp_gender + "\n" + ed.emp_address + "\n");
				System.out.println("\nProfessional Details of an Employee Are:\n");
				System.out.println(ed.emp_id + "\n" + ed.emp_name + "\n" + ed.emp_salary + "\n" + ed.emp_department
						+ "\n" + ed.emp_skills + "\n");
			}
		}
		if (flag == 0) {
			System.out.println("No Records Found");
		}
	}

	public void fetchDetails(int id) {
		for (EmployeeDetails ed : emp_list) {
			if (ed.emp_id == id) {
				flag = 1;
				System.out.println("\nPersonal Details of an Employee Are:\n");
				System.out
						.println(ed.emp_name + "\n" + ed.emp_age + "\n" + ed.emp_gender + "\n" + ed.emp_address + "\n");
				System.out.println("\nProfessional Details of an Employee Are:\n");
				System.out.println(ed.emp_id + "\n" + ed.emp_name + "\n" + ed.emp_salary + "\n" + ed.emp_department
						+ "\n" + ed.emp_skills + "\n");
			}
		}
		if (flag == 0) {
			System.out.println("No Records Found");
		}
	}

}
