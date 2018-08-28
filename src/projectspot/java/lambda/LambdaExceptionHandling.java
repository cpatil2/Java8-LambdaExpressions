package projectspot.java.lambda;

import java.util.function.BiConsumer;

/**
 * This class shows how to handle exceptions that may arise within lambda
 * expressions
 * 
 * @author chetan patil
 *
 */

public class LambdaExceptionHandling {

	public static void main(String[] args) {
		int numbers[] = { 1, 2, 3, 4 };
		int key = 0;
		/**
		 * I want to perform some action on some numbers with help of key numbers : an
		 * integer array key : an integer action : a lambda expression
		 */
		performAction(numbers, key, lambdaWrapper((a, k) -> System.out.println(a / key)));

	}

	private static BiConsumer<Integer, Integer> lambdaWrapper(BiConsumer<Integer, Integer> action) {

		return (v, k) -> {
			try {
				action.accept(v, k);
			} catch (ArithmeticException ae) {
				System.out.println("There is divide by zero problem");
			}

		};
	}

	/**
	 * The lambda expression wraper
	 * @param a
	 * @param key
	 * @param action
	 */
	private static void performAction(int[] a, int key, BiConsumer<Integer, Integer> action) {
		for (int p : a)
			action.accept(p, key);

	}

}
