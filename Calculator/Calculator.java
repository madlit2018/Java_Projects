/*************************************************************************
 *  Compilation:  javac Calculator.java
 *  Execution:    java Calculator
 *  Include: need calculator.helper to do all the math calculation
 *  
 *  The system will ask to enter value1, value2, and operation method
 *  This is a simple calculator code that takes 2 numbers
 *  to add, subtract, multiply, and divide
 * 
 *  *Note: It uses getInput method from InputHelper class to
 *   take user's input 1 and 2
 *
 *  Written by Yuttanant Suwansiri 12/19/2012
 *
 *************************************************************************/

package calculator;
import calculator.helpers.*;

public class Calculator {

	// Main program
	public static void main(String[] args) {
		String s1 = InputHelper.getInput("Enter value 1: ");
		String s2 = InputHelper.getInput("Enter value 2: ");
		String op = InputHelper.getInput("Enter 1=Add, 2=Subtract, 3=Multiply, 4=Divide: ");
		
		int opInt = Integer.parseInt(op);
		double result = 0;
		
		switch (opInt) {
		case 1:
			result = MathOperator.addInputs(s1, s2);
			break;
		case 2:
			result = MathOperator.subtractInputs(s1, s2);
			break;
		case 3:
			result = MathOperator.multiplyInputs(s1, s2);
			break;
		case 4:
			result = MathOperator.divideInputs(s1, s2);
			break;
		default:
			System.out.println("Incorrect value");
			break;
		}
		System.out.println("The answer is: " + result);
	}
	
}
