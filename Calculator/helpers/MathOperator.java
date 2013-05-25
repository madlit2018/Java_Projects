/*************************************************************************
 *  Helper Class for Calculator Class
 *  Calculator.java calls math operator methods to add,
 *  subtract, multiply, divide
 *
 *  Written by Yuttanant Suwansiri 12/19/2012
 *
 *************************************************************************/
package calculator.helpers;


public class MathOperator {
	
	 // Method: Add
		public static double addInputs(String s1, String s2) {
			double d1 = Double.parseDouble(s1);
			double d2 = Double.parseDouble(s2);
			double result = d1 + d2;
			return result;
		}
		
		// Method: Subtract
		public static double subtractInputs(String s1, String s2) {
			double d1 = Double.parseDouble(s1);
			double d2 = Double.parseDouble(s2);
			double result = d1 - d2;
			return result;
		}
		
		// Method: Multiply
		public static double multiplyInputs(String s1, String s2) {
			double d1 = Double.parseDouble(s1);
			double d2 = Double.parseDouble(s2);
			double result = d1 * d2;
			return result;
		}
		
		// Method: Divide
		public static double divideInputs(String s1, String s2) {
			double d1 = Double.parseDouble(s1);
			double d2 = Double.parseDouble(s2);
			double result = d1 / d2;
			return result;
		}
}
