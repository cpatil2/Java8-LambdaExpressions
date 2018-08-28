
package projectspot.java.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Because Lambdas are introduced in Java8 the class is named accordingly.
 * 
 * This class avoid using user-defined interfaces for lambda expressions. Rather
 * it uses in-build interfaces available in java.util.function package
 * 
 * Here two such in-build interfaces are use Predicate<T> which is used to test
 * received customized condition object of type T Consumer<T> which is used to
 * apply/accept received customized behavior on object of type T
 * 
 * @author chetan patil
 *
 */

public class InbuildFunctionalInterfaces {

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
		 * Print all Employees checkout lambda expression is passed in as second
		 * argument because we want to print all employees, condition is always true
		 */
		System.out.println("*Printing all Employees");
		printConditional(empList, p -> true, p -> System.out.println(p));

		/**
		 * Print all Employees first name starts with P checkout lambda expression
		 * passed as second argument to printConitional function
		 */
		System.out.println("*Printing all Employees first name strats with P");
		printConditional(empList, e -> e.getfName().startsWith("P"), p -> System.out.println(p.getfName()));

		/**
		 * Print all Employees last name strats with D checkout lambda expression passed
		 * as second argument to printConditional function
		 */
		System.out.println("*Printing all Employees last name strats with D");
		printConditional(empList, e -> e.getlName().startsWith("D"), p -> System.out.println(p.getlName()));
	}

	private static void printConditional(List<Employee> empList, Predicate<Employee> condition,
			Consumer<Employee> consumer) {
		// TODO Auto-generated method stub
		for (Employee e : empList) {
			if (condition.test(e)) {
				consumer.accept(e);
			}
		}

	}

}
