package com.Operations;
import java.util.*;

public class Delete_Operation extends Create_New_Emp {
	int flag = 0;
	Iterator<EmployeeDetails> itr = emp_list.iterator();
	public void delete() {
		emp_list.removeAll(emp_list);
		System.out.println("All Records Deleted");
	}

	public void delete(String name) {
		while (itr.hasNext()) {
			EmployeeDetails ed = itr.next();
			if (ed.emp_name.equalsIgnoreCase(name) || ed.emp_department.equalsIgnoreCase(name)) {
				flag = 1;
				itr.remove();
				System.out.println("Employee Removed");
			}
		}
	
		if (flag == 0) {
			System.out.println("No Records Found");
		}
	}
	
	

	public void delete(int id)  {
		
		while (itr.hasNext()) {
			EmployeeDetails ed = itr.next();
			if (ed.emp_id == id) {
				flag = 1;
				itr.remove();
				System.out.println("Employee Removed");
			}
		}
	
		
		if (flag == 0) {
			System.out.println("No Records Found");
		}
	}
}
		

	
	


