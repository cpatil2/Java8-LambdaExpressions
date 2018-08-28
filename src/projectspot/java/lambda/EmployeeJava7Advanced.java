
package projectspot.java.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This class is modification in EmployeeJava7 class
 * 
 * It does uses in-line instance creation for both interfaces Comparator and
 * Condition
 * 
 * @author chetan patil
 *
 */

public class EmployeeJava7Advanced {

	public static void main(String[] args) {
		/**
		 * Create a hard-coded list of employees
		 */

		List<Employee> empList = Arrays.asList(new Employee("Akshay", "Chaudhary", 1),
				new Employee("Pravin", "Kumar", 2), new Employee("Rahul", "Dravid", 3));

		/**
		 * Sort By Ascending order based on Last name checkout in-line instance creation
		 * at second argument
		 */

		Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getlName().compareTo(o2.getlName());
			}

		});

		/**
		 * Print all employees
		 * 
		 */
		System.out.println("*Printing all Employees");
		printall(empList);

		/**
		 * Print only employees having first name starting with 'P' checkout in-line
		 * instance creation at second argument
		 */
		System.out.println("*Printing all Employees first name strats with P");
		printConditional(empList, new Condition() {

			@Override
			public boolean Test(Employee e) {
				return e.getfName().startsWith("P");
			}

		});

		/**
		 * Print only employees having last name starting with 'D' checkout in-line
		 * instance creation at second argument
		 */
		System.out.println("*Printing all Employees last name strats with D");
		printConditional(empList, new Condition() {

			@Override
			public boolean Test(Employee e) {
				return e.getlName().startsWith("D");
			}

		});
	}

	/**
	 * Apply the given condition on all employees in given employee List
	 * 
	 * @param empList
	 * @param condition
	 */
	private static void printConditional(List<Employee> empList, Condition condition) {
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

/**
 * An interface that tests Employee objects against specific implementation of
 * condition
 * 
 * @author chetan patil
 *
 */
interface Condition {
	public boolean Test(Employee e);
}
