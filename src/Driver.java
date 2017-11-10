/**
 * Lab1 Driver class
 * 
 * @author tanii_asami
 *
 */
public class Driver {
	public static void main(String[] args) {
		// Using the second Model constructor
		Model test1 = new Model("Susan", "Smith", 70, 120, false, true);
		test1.printDetails();

		System.out.println("");

		// Using the third Model constructor
		Model test2 = new Model("Tiger", "Woods", 72, 190);
		test2.printDetails();

		System.out.println("");

		// Lab 1b:
		Model test3 = new Model("Susan", "Smith", 70, 120, true, false);
		test3.displayModelDetails();

		System.out.println();

		Model test4 = new Model("Susan", "Smith", 70, 120, true, false);
		test4.displayModelDetails(true);

	}
}
