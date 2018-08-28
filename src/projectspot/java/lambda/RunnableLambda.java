package projectspot.java.lambda;

/**
 * This class demonstrate lambda expression use for Runnable interface Runnable
 * interface has only one method run(). So Runnable becomes eligible for
 * functional interface
 * 
 * @author chetan patil
 *
 */
public class RunnableLambda {
	public static void main(String args[]) {
		/**
		 * checkout run method code is directly used as lambda expression
		 */
		Thread r = new Thread(() -> System.out.println("I am thread"));
		r.start();
		System.out.println("I am Main");
	}
}
