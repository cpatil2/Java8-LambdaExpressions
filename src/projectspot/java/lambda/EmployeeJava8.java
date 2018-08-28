
package projectspot.java.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Because Lambdas are introduced in Java8 the class is named accordingly.
 * 
 * This class uses lambda expressions instead of particularly creating in-line
 * instances of interfaces e.g. comparator and Condition interfaces
 * 
 * @author chetan patil
 *
 */

public class EmployeeJava8 {

	public static void main(String[] args) {

		/**
		 * Create a hard-coded list of employees
		 */
		List<Employee> empList = Arrays.asList(new Employee("Akshay", "Chaudhary", 1),
				new Employee("Pravin", "Kumar", 2), new Employee("Rahul", "Dravid", 3));

		/**
		 * Sort By Ascending order based on Last name checkout lambda expression passed
		 * as second argument to sort function
		 */
		Collections.sort(empList, (o1, o2) -> o1.getlName().compareTo(o2.getlName()));

		/**
		 * Print all Employees
		 */
		System.out.println("*Printing all Employees");
		printall(empList);

		/**
		 * Print all Employees first name starts with P checkout lambda expression
		 * passed as second argument to printConitional function
		 */
		System.out.println("*Printing all Employees first name strats with P");
		printConditional(empList, e -> e.getfName().startsWith("P"));

		/**
		 * Print all Employees last name strats with D checkout lambda expression passed
		 * as second argument to printConditional function
		 */
		System.out.println("*Printing all Employees last name strats with D");
		printConditional(empList, e -> e.getlName().startsWith("D"));
	}

	private static void printConditional(List<Employee> empList, Condition condition) {
		// TODO Auto-generated method stub
		for (Employee e : empList) {
			if (condition.Test(e)) {
				System.out.println(e);
			}
		}

	}

	/**
	 * A function to print all existing employees as it is
	 * 
	 * @param empList
	 */

	private static void printall(List<Employee> empList) {
		// TODO Auto-generated method stub
		for (Employee e : empList) {
			System.out.println(e);
		}
	}

}
