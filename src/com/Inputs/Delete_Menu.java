package com.Inputs;

import com.Operations.Delete_Operation;

import java.util.*;

public class Delete_Menu extends Fetch_Menu{
	Scanner scanner = new Scanner(System.in);
	Delete_Operation dem = new Delete_Operation();

	/*
	 * This constructor calls super constructor to call the options to the user for
	 * deleting an Employee. After calling constructor calling deleteOptions methods
	 * and controlling flow accordingly
	 */
	public Delete_Menu()  {
		//Chaining constructor concept is used to show options to the user
		deleteOptions();
	}

	public void deleteOptions() {
		
		switch (scanner.nextInt()) {
		case 1:
			dem.delete();
			break;
		case 2:
			System.out.println("Please enter the id of the Employee");
			int id = scanner.nextInt();
			dem.delete(id);
			break;

		case 3:
			System.out.println("Please enter the Name of the Employee");
			scanner.nextLine();
			String name = scanner.nextLine();
			dem.delete(name);
			break;

		case 4:

			System.out.println("Please enter the Department of the Employee");
			scanner.nextLine();
			String department = scanner.nextLine();
			dem.delete(department);
			break;

		default:
			System.out.println("Sorry! Wrong Input");
		}
		}
		
}
