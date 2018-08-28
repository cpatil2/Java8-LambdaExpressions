package projectspot.java.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This is simple Java7 implementation for employee data manipulation such as
 * sorting employees by last name, printing only employees satisfying specific
 * condition
 * 
 * @author chetan patil
 *
 */
public class EmployeeJava7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList = Arrays.asList(new Employee("Akshay", "Chaudhary", 1),
				new Employee("Pravin", "Kumar", 2), new Employee("Rahul", "Dravid", 3));

		// Sort Ascending order based on Last name
		Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getlName().compareTo(o2.getlName());
			}

		});

		// Print all Employees
		System.out.println("*Printing all Employees");
		printall(empList);
		// Print all Employees first name starts with P
		System.out.println("*Printing all Employees first name strats with P");
		printFnameStartwithP(empList);
		// Print all Employees last name strats with D
		System.out.println("*Printing all Employees last name strats with D");
		printLnameStartwithD(empList);
	}

	private static void printLnameStartwithD(List<Employee> empList) {

		for (Employee e : empList) {
			if (e.getlName().startsWith("D"))
				System.out.println(e);
		}

	}

	private static void printFnameStartwithP(List<Employee> empList) {
		for (Employee e : empList) {
			if (e.getfName().startsWith("P"))
				System.out.println(e);
		}
	}

	private static void printall(List<Employee> empList) {
		for (Employee e : empList) {
			System.out.println(e);
		}
	}

}
