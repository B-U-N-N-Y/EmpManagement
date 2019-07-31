package com.Operations;
import java.util.*;

public class Create_New_Emp {
	
	
	static ArrayList<EmployeeDetails> emp_list=new ArrayList<>();
public void newEmployee() {
		
		//This method takes all data of the Employee and save it into Collection 
		Scanner input = new Scanner(System.in);
		System.out.println(" PERSONAL DETAILS    ");
		System.out.print("Please enter your Name:");
		String name = input.nextLine();
		System.out.print("Please enter your Age:");
		int age=input.nextInt();
		
		input.nextLine();
		System.out.print("Please enter Gender of the Employee:");
		String gender=input.nextLine();
		System.out.print("Please enter Residence of the Employee:");
		String address=input.nextLine();
		
		System.out.println(" PROFESSIONAL DETAILS ");
		System.out.print("Please enter the id:");
		int id = input.nextInt();
		System.out.print("Please enter the Salary:");
		double salary = input.nextDouble();
		input.nextLine();
		System.out.print("Please enter your Department:");
		String department = input.nextLine();
		System.out.print("Please enter the Skills Employee have:");
		String skills=input.nextLine();
		
		/*
		 *  Adding object of EmployeeDetails Class in the ArrayList
		 * This EmployeeDetails class contains object like id,age,name etc.
		 */
		emp_list.add(new EmployeeDetails(name, id, salary, department, age, address, gender, skills));
		System.out.println("Employee Added\n");
		}

}
